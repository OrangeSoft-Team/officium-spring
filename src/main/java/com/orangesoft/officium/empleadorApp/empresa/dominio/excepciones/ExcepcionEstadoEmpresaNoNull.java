package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionEstadoEmpresaNoNull extends RuntimeException{
    public ExcepcionEstadoEmpresaNoNull(){
        super("El estado de la empresa no puede ser nulo");
    }
}
