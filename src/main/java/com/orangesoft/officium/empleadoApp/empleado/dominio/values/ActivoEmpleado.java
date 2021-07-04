package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.cuenta.dominio.EnumEstadoCuentaEmpleado;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class ActivoEmpleado {
    private final EnumEstadoCuentaEmpleado activo;

    public ActivoEmpleado(EnumEstadoCuentaEmpleado activo) {
        this.activo = activo;
    }
}
