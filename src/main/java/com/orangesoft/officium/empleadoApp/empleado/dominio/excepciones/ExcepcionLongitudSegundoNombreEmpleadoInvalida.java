package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionLongitudSegundoNombreEmpleadoInvalida extends RuntimeException{
    public ExcepcionLongitudSegundoNombreEmpleadoInvalida() {
        super("La longitud del segundo nombre del empleado debe estar entre 3 y 40 caracteres");
    }
}
