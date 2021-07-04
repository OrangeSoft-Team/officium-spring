package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionFechaNacimientoEmpleadoInvalida extends RuntimeException {
    public ExcepcionFechaNacimientoEmpleadoInvalida() {
        super("La fecha de nacimiento del empleado no puede igual o mayor a la actual");
    }
}
