package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionLongitudDireccionEmpresaInvalida extends RuntimeException{
    public ExcepcionLongitudDireccionEmpresaInvalida(){
        super("debe contener entre 4 y 256 caracteres");
    }
}
