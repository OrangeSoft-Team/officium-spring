package com.orangesoft.officium.empleadorApp.habilidad.Excepciones;

public class ExcepcionCategoriaHabilidadNoNull extends RuntimeException{
    public ExcepcionCategoriaHabilidadNoNull(){
        super("la categoria de la habilidad no puede ser null");
    }
}
