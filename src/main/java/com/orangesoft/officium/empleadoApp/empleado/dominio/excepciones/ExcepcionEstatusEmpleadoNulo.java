package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionEstatusEmpleadoNulo extends RuntimeException {
    public ExcepcionEstatusEmpleadoNulo() {
        super("El estatus del empleado no puede ser nulo");
    }
}
