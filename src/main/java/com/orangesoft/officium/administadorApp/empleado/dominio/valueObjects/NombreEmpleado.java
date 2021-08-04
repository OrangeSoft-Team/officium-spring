package com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NombreEmpleado {
    private String nombreEmpleado;

    public NombreEmpleado(String nombreEmpleado){
        if (nombreEmpleado == null || nombreEmpleado.isEmpty()){
            throw new ExcepcionCampoNulo("uuid postulacion");
        }
        this.nombreEmpleado = nombreEmpleado;
    }
}
