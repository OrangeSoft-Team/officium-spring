package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionCodigoPostalNulo extends RuntimeException{
    public ExcepcionCodigoPostalNulo(){
        super("no puede ser nulo");
    }
}
