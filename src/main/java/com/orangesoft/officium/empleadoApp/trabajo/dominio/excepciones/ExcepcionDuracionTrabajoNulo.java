package com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones;

public class ExcepcionDuracionTrabajoNulo extends RuntimeException {
    public ExcepcionDuracionTrabajoNulo() {
        super("Duración del trabajo inválida");
    }
}
