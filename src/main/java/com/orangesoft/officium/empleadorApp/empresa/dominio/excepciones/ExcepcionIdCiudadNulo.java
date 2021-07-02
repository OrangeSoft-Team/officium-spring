package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;


public class ExcepcionIdCiudadNulo extends RuntimeException{
    public ExcepcionIdCiudadNulo(){
        super("no puede ser nulo");
    }
}
