package com.orangesoft.officium.empleadorApp.habilidad.Excepciones;

public class ExcepcionIdHabilidadNoNull extends RuntimeException{
    public ExcepcionIdHabilidadNoNull(){
        super("EL identificadr no puede ser null");
    }
}
