package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionDireccionEmpresaNula extends RuntimeException{
    public ExcepcionDireccionEmpresaNula(){
        super("no puede ser nulo");
    }
}
