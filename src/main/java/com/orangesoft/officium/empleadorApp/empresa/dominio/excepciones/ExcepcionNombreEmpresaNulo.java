package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionNombreEmpresaNulo extends RuntimeException{
    public ExcepcionNombreEmpresaNulo(){
        super("no puede ser nulo");
    };
}
