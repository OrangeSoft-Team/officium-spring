package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorOfertaLaboralADetalleDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ServicioObtenerDetalleOfertaLaboralEmpleado {
    @Autowired
    private final MapeadorOfertaLaboralADetalleDTO mapeadorOfertaLaboralADetalleDTO;
    @Autowired
    private final CasoUsoConsultarDetallesOfertaLaboral consultarDetallesOfertaLaboral;

    @Transactional(readOnly = true)
    public DtoDetalleOfertaLaboralActivaEmpleado consultarDetallesOfertaLaboral(String idOfertaLaboral) {
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e){
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        Tupla<Empresa, OfertaLaboral> tupla = consultarDetallesOfertaLaboral.consultarDetallesOfertaLaboral(new IdOfertaLaboral(idOfertaLaboral));
        return mapeadorOfertaLaboralADetalleDTO.mapOfertaLaboralADetalleDto(tupla.getFirstElement(), tupla.getSecondElement());
    }
}
