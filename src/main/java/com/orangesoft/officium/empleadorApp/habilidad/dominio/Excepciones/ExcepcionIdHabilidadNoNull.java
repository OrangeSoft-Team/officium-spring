package com.orangesoft.officium.empleadorApp.habilidad.dominio.Excepciones;

public class ExcepcionIdHabilidadNoNull extends RuntimeException{
    public ExcepcionIdHabilidadNoNull(){
        super("EL identificadr no puede ser null");
    }
}
