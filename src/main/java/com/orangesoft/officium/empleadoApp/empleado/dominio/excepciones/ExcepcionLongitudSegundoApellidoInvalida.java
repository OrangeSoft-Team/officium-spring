package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionLongitudSegundoApellidoInvalida extends RuntimeException {
    public ExcepcionLongitudSegundoApellidoInvalida() {
        super("La longitud del segundo apellido del empleado debe estar entre los 3 y 40 caracteres");
    }
}
