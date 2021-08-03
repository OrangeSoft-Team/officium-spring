package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionIdEmpleadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdEmpleado {
    private final UUID idEmpleado;

    public IdEmpleado(UUID idEmpleado) {
        validarIdEmpleado(idEmpleado);
        this.idEmpleado = idEmpleado;
    }

    private void validarIdEmpleado(UUID idEmpleado) {
        if(idEmpleado==null)
            throw new ExcepcionIdEmpleadoNulo();
    }

}
