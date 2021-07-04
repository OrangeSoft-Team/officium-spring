package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorOfertaLaboralPersistenciaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioCrearOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioEmpresaAdministrador;
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
    private final MapeadorOfertaLaboralPersistenciaAdministrador mapeadorOfertaLaboralPersistencia;

    @Override
    public void crearOfertaLaboral(OfertaLaboral ofertaLaboral) {
        if (repositorioEmpresa.getPersistenciaEmpresaByUuid(UUID.fromString(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa())) == null) {
            throw new RuntimeException("Empresa no encontrada");
        }
        repositorioCrearOfertaLaboral.save(
                mapeadorOfertaLaboralPersistencia.ofertaLaboralAPersistencia(ofertaLaboral)
        );
    }
}
