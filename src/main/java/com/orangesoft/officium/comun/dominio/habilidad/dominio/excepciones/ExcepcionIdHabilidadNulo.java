package com.orangesoft.officium.comun.dominio.habilidad.dominio.excepciones;

public class ExcepcionIdHabilidadNulo extends RuntimeException {
    public ExcepcionIdHabilidadNulo() {
        super("El id de la habilidad no puede ser nulo");
    }
}
