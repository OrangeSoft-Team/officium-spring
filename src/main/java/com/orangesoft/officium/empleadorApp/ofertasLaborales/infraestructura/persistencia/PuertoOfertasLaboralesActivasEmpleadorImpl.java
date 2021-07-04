package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorPersistenciaOfertaLaboralActivaEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioOfertasLaboralesActivasEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoOfertasLaboralesActivasEmpleadorImpl implements PuertoVerOfertasLaboralesActivasEmpleador {
    @Autowired
    private final RepositorioOfertasLaboralesActivasEmpleador repositorioOfertasLaboralesActivas;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboralActivaEmpleador mapeadorPersistenciaOfertaLaboralActiva;

    @Override
    public List<OfertaLaboral> ofertasLaboralesActivas(IdEmpresa idEmpresa) {
        List<PersistenciaOfertaLaboralEmpleador> ofertaLaborals = repositorioOfertasLaboralesActivas.buscarOfertasLaboralesActivas(UUID.fromString(idEmpresa.getIdEmpresa()));
        System.out.println(ofertaLaborals.toString());
        return ofertaLaborals
                 .stream()
                .map(mapeadorPersistenciaOfertaLaboralActiva::persistenciaAOfertaLaboral)
                .collect(Collectors.toList());
    }
}
