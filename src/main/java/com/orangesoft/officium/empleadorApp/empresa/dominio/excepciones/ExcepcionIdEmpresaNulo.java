package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionIdEmpresaNulo extends RuntimeException{
    public ExcepcionIdEmpresaNulo(){
        super("no puede ser nulo");
    }
}
