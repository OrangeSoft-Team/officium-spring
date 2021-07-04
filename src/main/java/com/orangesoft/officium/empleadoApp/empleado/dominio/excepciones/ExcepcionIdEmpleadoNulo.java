package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionIdEmpleadoNulo extends RuntimeException {
    public ExcepcionIdEmpleadoNulo() {
        super("El identificador del empleado no puede ser nulo");
    }
}
