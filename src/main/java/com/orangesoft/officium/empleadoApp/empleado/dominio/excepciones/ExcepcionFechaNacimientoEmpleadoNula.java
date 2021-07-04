package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionFechaNacimientoEmpleadoNula extends RuntimeException {
    public ExcepcionFechaNacimientoEmpleadoNula() {
        super("La fecha de nacimiento del empleado no puede ser nula");
    }
}
