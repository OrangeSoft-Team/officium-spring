package com.orangesoft.officium.empleadorApp.habilidad.Excepciones;

public class ExcepcionNombreHabilidadNoNull extends RuntimeException{
    public ExcepcionNombreHabilidadNoNull(){
        super(" el nombre de la habilidad es requerido");
    }
}
