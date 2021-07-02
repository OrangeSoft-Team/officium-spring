package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesActivas;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorPersistenciaOfertaLaboralActiva;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioOfertasLaboralesActivas;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoOfertasLaboralesActivas implements PuertoVerOfertasLaboralesActivas {
    @Autowired
    private final RepositorioOfertasLaboralesActivas repositorioOfertasLaboralesActivas;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboralActiva mapeadorPersistenciaOfertaLaboralActiva;

    @Override
    public List<OfertaLaboral> ofertasLaboralesActivas() {
        return repositorioOfertasLaboralesActivas.findAll()
                .stream()
                .map(mapeadorPersistenciaOfertaLaboralActiva::persistenciaAOfertaLaboral)
                .collect(Collectors.toList());
    }
}
