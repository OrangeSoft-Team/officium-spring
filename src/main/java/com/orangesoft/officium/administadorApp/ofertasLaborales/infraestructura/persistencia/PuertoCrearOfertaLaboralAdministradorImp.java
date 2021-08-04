package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorAPersistenciaHabilidadOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorOfertaLaboralPersistenciaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioCrearHabilidadOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioCrearOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.empresa.infraestructura.persistencia.repositorios.RepositorioEmpresaAdministrador;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorPersistenciaHabilidad;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoCrearOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;

import java.util.UUID;

@Component
@AllArgsConstructor
public class PuertoCrearOfertaLaboralAdministradorImp implements PuertoCrearOfertaLaboralAdministrador {

    @Autowired
    private final RepositorioCrearOfertaLaboralAdministrador repositorioCrearOfertaLaboral;

    @Autowired
    private final RepositorioEmpresaAdministrador repositorioEmpresa;

    @Autowired
    private final RepositorioCrearHabilidadOfertaLaboral repositorioCrearHabilidadOfertaLaboral;

    @Autowired
    private final MapeadorOfertaLaboralPersistenciaAdministrador mapeadorOfertaLaboralPersistencia;

    @Autowired
    private final MapeadorAPersistenciaHabilidadOfertaLaboralAdministrador mapeadorAPersistenciaHabilidadOfertaLaboralAdministrador;

    @Override
    public void crearOfertaLaboral(OfertaLaboral ofertaLaboral) {
        if (repositorioEmpresa.getPersistenciaEmpresaByUuid(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa()) == null) {
            throw new RuntimeException("Empresa no encontrada");
        }
        repositorioCrearOfertaLaboral.save(
                mapeadorOfertaLaboralPersistencia.ofertaLaboralAPersistencia(ofertaLaboral)
        );
        try{
            ofertaLaboral.getHabilidades().forEach(habilidad -> {
                repositorioCrearHabilidadOfertaLaboral.save(
                        mapeadorAPersistenciaHabilidadOfertaLaboralAdministrador.habilidadAPersistencia(ofertaLaboral.getIdOfertaLaboral() ,habilidad.getIdHabilidad())
                );
            });
        } catch (Exception ignored){

        }
    }
}
