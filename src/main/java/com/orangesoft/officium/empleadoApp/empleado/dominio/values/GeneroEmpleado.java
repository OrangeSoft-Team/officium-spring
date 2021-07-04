package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.genero.dominio.EnumGeneroEmpleado;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class GeneroEmpleado {
    private EnumGeneroEmpleado genero;

    public GeneroEmpleado(EnumGeneroEmpleado genero) {
        this.genero = genero;
    }
}
