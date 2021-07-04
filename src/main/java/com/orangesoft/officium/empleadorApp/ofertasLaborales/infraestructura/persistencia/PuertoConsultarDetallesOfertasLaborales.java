package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorPersistenciaOfertaLaboralActiva;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioConsultarDetallesOfertasLaborales;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoConsultarDetallesOfertasLaborales implements com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoConsultarDetallesOfertasLaborales {

    @Autowired
    private final RepositorioConsultarDetallesOfertasLaborales repositorioConsultarDetallesOfertasLaborales;

    @Autowired
    private final MapeadorPersistenciaOfertaLaboralActiva mapeadorPersistenciaOfertaLaboralActiva;


    @Override
    public List<OfertaLaboral> consultarDetallesOfertasLaborales() {
        return repositorioConsultarDetallesOfertasLaborales.consultarDetalleOfertasLaborales()
                .stream()
                .map(mapeadorPersistenciaOfertaLaboralActiva::persistenciaAOfertaLaboral)
                .collect(Collectors.toList());
    }
}
