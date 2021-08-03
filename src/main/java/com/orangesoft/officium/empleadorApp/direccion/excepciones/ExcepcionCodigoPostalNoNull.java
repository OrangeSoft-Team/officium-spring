package com.orangesoft.officium.empleadorApp.direccion.excepciones;

public class ExcepcionCodigoPostalNoNull extends RuntimeException{
    public ExcepcionCodigoPostalNoNull(){
        super("El codigo Postal no puede ser nulo");
    }
}
