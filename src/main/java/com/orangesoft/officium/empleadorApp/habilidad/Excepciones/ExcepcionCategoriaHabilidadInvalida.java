package com.orangesoft.officium.empleadorApp.habilidad.Excepciones;

public class ExcepcionCategoriaHabilidadInvalida extends RuntimeException {
    public ExcepcionCategoriaHabilidadInvalida(){
        super("la categoria de la habilidad debe contener entre 4 y 64 caracteres ");
    }
}
