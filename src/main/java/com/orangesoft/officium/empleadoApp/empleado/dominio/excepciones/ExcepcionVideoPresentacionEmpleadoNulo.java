package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionVideoPresentacionEmpleadoNulo extends RuntimeException {
    public ExcepcionVideoPresentacionEmpleadoNulo() {
        super("El url del video de presentacion del empleado no puede ser nulo");
    }
}
