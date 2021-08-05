package com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones;

public class ExcepcionEstadoTrabajoNulo extends RuntimeException {
    public ExcepcionEstadoTrabajoNulo() {
        super("Estado del trabajo invalido");
    }
}
