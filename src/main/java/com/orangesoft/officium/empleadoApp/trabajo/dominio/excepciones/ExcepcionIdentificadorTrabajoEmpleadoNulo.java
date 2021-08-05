package com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones;

public class ExcepcionIdentificadorTrabajoEmpleadoNulo extends RuntimeException {
    public ExcepcionIdentificadorTrabajoEmpleadoNulo() {
        super("El identificador del trabajo del empleado no puede ser nulo");
    }
}
