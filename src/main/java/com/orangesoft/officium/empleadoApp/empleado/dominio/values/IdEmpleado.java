package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionIdEmpleadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class IdEmpleado {
    private final String idEmpleado;

    public IdEmpleado(String idEmpleado) {
        validarIdEmpleado(idEmpleado);
        this.idEmpleado = idEmpleado;
    }

    private void validarIdEmpleado(String idEmpleado) {
        if(idEmpleado==null)
            throw new ExcepcionIdEmpleadoNulo();
    }

}
