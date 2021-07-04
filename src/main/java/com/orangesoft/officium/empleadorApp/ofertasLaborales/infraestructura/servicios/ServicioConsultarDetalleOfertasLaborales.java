package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorOfertaLaboralDetalleDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioConsultarDetalleOfertasLaborales {
    @Autowired
    private final MapeadorOfertaLaboralDetalleDTO mapeadorOfertaLaboralDetalleDTO;

    @Autowired
    private final CasoUsoConsultarDetallesOfertasLaborales casoUsoConsultarDetallesOfertasLaborales;

    public List<DtoDetalleOfertaLaboralEmpresa> consultarDetalleOfertasLaborales(){
        return casoUsoConsultarDetallesOfertasLaborales.consultarDetallesofertasLaborales()
                .stream().map(mapeadorOfertaLaboralDetalleDTO::mapOfertaLaboralADetalleDto)
                .collect(Collectors.toList());
    }
}
