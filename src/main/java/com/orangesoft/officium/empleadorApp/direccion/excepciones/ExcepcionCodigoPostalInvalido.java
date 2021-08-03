package com.orangesoft.officium.empleadorApp.direccion.excepciones;

public class ExcepcionCodigoPostalInvalido extends RuntimeException{
    public ExcepcionCodigoPostalInvalido(){
        super("EL codigo postal debe contener entre 1 10 caracteres");
    }
}
