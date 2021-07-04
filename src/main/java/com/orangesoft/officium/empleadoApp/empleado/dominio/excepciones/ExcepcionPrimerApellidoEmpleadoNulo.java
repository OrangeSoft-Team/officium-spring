package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionPrimerApellidoEmpleadoNulo extends RuntimeException{
    public ExcepcionPrimerApellidoEmpleadoNulo() {
        super("El primer apellido del empleado no puede ser nulo");
    }
}
