package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionGeneroEmpleadoNulo extends RuntimeException{
    public ExcepcionGeneroEmpleadoNulo() {
        super("El genero del empleado no puede ser nulo");
    }
}
