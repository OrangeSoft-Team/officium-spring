package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionLongitudPrimerNombreEmpleadoInvalida extends RuntimeException {
    public ExcepcionLongitudPrimerNombreEmpleadoInvalida() {
        super("La logitd del primer nombre del empleado debe estar en 3 y 40 caracteres");
    }
}
