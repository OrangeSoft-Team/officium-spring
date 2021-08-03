package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.comun.persona.EnumGenero;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class GeneroEmpleado {
    private EnumGenero genero;

    public GeneroEmpleado(EnumGenero genero) {
        this.genero = genero;
    }
}
