package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoAplicarOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ServicioAplicarOfertaLaboralEmpleado {
    @Autowired
    private final CasoUsoAplicarOfertaLaboral casoUsoAplicarOfertaLaboral;

    @Transactional
    public void aplicarOfertaLaboral(String idEmpleado, String idEmpresa, String idOfertaLaboral){
        try{
            UUID.fromString(idOfertaLaboral);
            UUID.fromString(idEmpleado);
            UUID.fromString(idEmpresa);
        }catch (IllegalArgumentException e){
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        casoUsoAplicarOfertaLaboral.aplicarOfertaLaboral(new IdEmpleado(UUID.fromString(idEmpleado)), new IdEmpresa(UUID.fromString(idEmpresa)), new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)));
    }
}
