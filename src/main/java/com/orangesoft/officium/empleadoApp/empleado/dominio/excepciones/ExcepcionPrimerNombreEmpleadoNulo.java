package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionPrimerNombreEmpleadoNulo extends RuntimeException {
    public ExcepcionPrimerNombreEmpleadoNulo() {
        super("El primer nombre del empleado no puede ser nulo");
    }
}
