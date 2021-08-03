package com.orangesoft.officium.empleadorApp.direccion.excepciones;

public class ExcepcionIdDireccionNoNull extends RuntimeException{
    public ExcepcionIdDireccionNoNull(){
        super("la direcion no puede ser null");
    }
}
