package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia;


import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesInactivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorPersistenciaOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioOfertaLaboralActivaEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioOfertaLaboralInactivasEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoOfertaLaboralInactivaImpEmpleador implements PuertoVerOfertasLaboralesInactivasEmpleador {
    @Autowired
    private final RepositorioOfertaLaboralInactivasEmpleador repositorioOfertasLaboralesInactivas;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboralEmpleador mapeadorPersistenciaOfertaLaboralEmpleador;
    @Override
    public List<OfertaLaboral> ofertasLaboralesInactivas(IdEmpresa idEmpresa) {
        List<PersistenciaOfertaLaboral> ofertaLaborals = repositorioOfertasLaboralesInactivas.buscarOfertasLaboralesInactivas(UUID.fromString(idEmpresa.getIdEmpresa()));
        System.out.println(ofertaLaborals.toString());
        return ofertaLaborals
                .stream()
                .map(mapeadorPersistenciaOfertaLaboralEmpleador::persistenciaOfertaLaboral)
                .collect(Collectors.toList());

    }
}
