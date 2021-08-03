package com.orangesoft.officium.empleadorApp.direccion.excepciones;

public class ExcepcionCalleInvalida extends RuntimeException{
    public ExcepcionCalleInvalida(){
        super("la calle debe contener entre 2 y 128 caracteres");
    }
}
