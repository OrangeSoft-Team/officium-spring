package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorOfertaLaboralPersistencia;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioCrearOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioEmpresa;
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
    private final RepositorioCrearOfertaLaboral repositorioCrearOfertaLaboral;

    @Autowired
    private final RepositorioEmpresa repositorioEmpresa;

    @Autowired
    private final MapeadorOfertaLaboralPersistencia mapeadorOfertaLaboralPersistencia;

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
