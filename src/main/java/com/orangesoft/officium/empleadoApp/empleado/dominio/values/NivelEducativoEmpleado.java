package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.comun.dominio.empleado.EnumNivelEducativoEmpleado;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
public final class NivelEducativoEmpleado {
    private final EnumNivelEducativoEmpleado nivelEducativoEmpleado;
}
