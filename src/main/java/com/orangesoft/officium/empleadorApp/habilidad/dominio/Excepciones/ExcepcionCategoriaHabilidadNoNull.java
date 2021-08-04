package com.orangesoft.officium.empleadorApp.habilidad.dominio.Excepciones;

public class ExcepcionCategoriaHabilidadNoNull extends RuntimeException{
    public ExcepcionCategoriaHabilidadNoNull(){
        super("la categoria de la habilidad no puede ser null");
    }
}
