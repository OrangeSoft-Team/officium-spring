package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios;


import com.orangesoft.officium.empleadorApp.Tupla.Tupla;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertasLaboralesEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoConsultarDetallesOfertasLaboralesEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDtoConsultarOfertasLaboralesEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioConsultarDetallesOfertasLaborales {

    @Autowired
    private final MapeadorDtoConsultarOfertasLaboralesEmpleador mapeadorOfertaLaboralDetalleDTO;

    @Autowired
    private final CasoUsoConsultarDetallesOfertasLaboralesEmpleador casoUsoConsultarDetallesOfertasLaborales;

    public DtoConsultarDetallesOfertasLaboralesEmpleador consultarDetallesOfertaLaboral(String idOferta) {
        Tupla<Empresa, OfertaLaboral> tupla = casoUsoConsultarDetallesOfertasLaborales.consultarDetallesOfertaLaboral(new IdOfertaLaboral(idOferta));
        return mapeadorOfertaLaboralDetalleDTO.mapOfertaLaboralConsultarDetallesDto(tupla.getFirstElement(), tupla.getSecondElement());
    }
}
