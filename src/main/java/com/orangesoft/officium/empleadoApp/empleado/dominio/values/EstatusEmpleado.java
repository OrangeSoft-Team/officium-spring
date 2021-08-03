package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.comun.dominio.empleado.EnumEstatusEmpleado;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class EstatusEmpleado {
    private final EnumEstatusEmpleado activo;

    public EstatusEmpleado(EnumEstatusEmpleado activo) {
        this.activo = activo;
    }
}
