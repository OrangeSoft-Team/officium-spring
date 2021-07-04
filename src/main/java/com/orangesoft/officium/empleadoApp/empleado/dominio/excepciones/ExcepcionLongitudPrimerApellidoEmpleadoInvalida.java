package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionLongitudPrimerApellidoEmpleadoInvalida extends RuntimeException{
    public ExcepcionLongitudPrimerApellidoEmpleadoInvalida() {
        super("La logitud del primer apellido del empleado debe estar entre los 3 y 40 caracteres");
    }
}
