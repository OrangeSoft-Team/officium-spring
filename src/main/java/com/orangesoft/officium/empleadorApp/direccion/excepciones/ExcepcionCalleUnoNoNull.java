package com.orangesoft.officium.empleadorApp.direccion.excepciones;

public class ExcepcionCalleUnoNoNull extends RuntimeException{
    public ExcepcionCalleUnoNoNull(){
        super(" el nombre de la calle no puede ser null");
    }
}
