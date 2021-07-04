package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.empleadorApp.Tupla.Tupla;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralEmpresa;
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

    public DtoDetalleOfertaLaboralEmpresa consultarDetallesOfertaLaboral(String idOferta) {
        Tupla<Empresa, OfertaLaboral> tupla = casoUsoConsultarDetallesOfertasLaborales.consultarDetallesOfertaLaboral(new IdOfertaLaboral(idOferta));
        return mapeadorOfertaLaboralDetalleDTO.mapOfertaLaboralADetalleDto(tupla.getFirstElement(), tupla.getSecondElement());
    }
}
