package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoConsultarPostulacionesOfertasLaboralesEmpleado;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ServicioConsultarPostulacionesOfertasLaboralesEmpleado {

    @Transactional(readOnly = true)
    public List<DtoConsultarPostulacionesOfertasLaboralesEmpleado> consultarPostulacionesOfertasLaboralesEmpleado(String idEmpleado) {
        try{
            UUID.fromString(idEmpleado);
        }catch (IllegalArgumentException e){
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        return null;
    }
}
