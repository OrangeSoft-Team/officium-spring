package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionIdPaisNulo extends RuntimeException{
    public ExcepcionIdPaisNulo(){
        super("no puede ser nulo");
    }
}
