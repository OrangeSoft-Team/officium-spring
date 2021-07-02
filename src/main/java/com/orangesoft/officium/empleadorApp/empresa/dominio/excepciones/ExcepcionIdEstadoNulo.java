package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionIdEstadoNulo extends RuntimeException{
    public ExcepcionIdEstadoNulo(){
        super("no puede ser nulo");
    }
}
