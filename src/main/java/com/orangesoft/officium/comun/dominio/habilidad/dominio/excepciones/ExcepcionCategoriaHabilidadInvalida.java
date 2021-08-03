package com.orangesoft.officium.comun.dominio.habilidad.dominio.excepciones;

public class ExcepcionCategoriaHabilidadInvalida extends RuntimeException {
    public ExcepcionCategoriaHabilidadInvalida() {
        super("La categoría de la habilidad no puede ser nula o estar vacia");
    }
}
