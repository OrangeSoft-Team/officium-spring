package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionFechaNacimientoEmpleadoInvalida;
import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionFechaNacimientoEmpleadoNula;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@EqualsAndHashCode
@Getter
public final class FechaNacimientoEmpleado {
    private final Instant fechaNacimiento;

    public FechaNacimientoEmpleado(Instant fechaNacimiento) {
        validarFechaNacimientoEmpleado(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
    }

    private void validarFechaNacimientoEmpleado(Instant fechaNacimiento) {
        if(fechaNacimiento == null)
            throw new ExcepcionFechaNacimientoEmpleadoNula();
        if(fechaNacimiento.isAfter(Instant.now()))
            throw new ExcepcionFechaNacimientoEmpleadoInvalida();
        if(fechaNacimiento.isAfter(Instant.now().minus(18, ChronoUnit.YEARS)))
            throw new ExcepcionFechaNacimientoEmpleadoMenor();
    }
}
