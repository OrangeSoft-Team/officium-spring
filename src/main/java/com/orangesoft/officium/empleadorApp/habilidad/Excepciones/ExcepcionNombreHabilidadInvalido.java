package com.orangesoft.officium.empleadorApp.habilidad.Excepciones;

public class ExcepcionNombreHabilidadInvalido extends RuntimeException{
    public ExcepcionNombreHabilidadInvalido(){
        super("EL nombre de la habilidad debe contener entre 4 y 64 caracteres");
    }
}
