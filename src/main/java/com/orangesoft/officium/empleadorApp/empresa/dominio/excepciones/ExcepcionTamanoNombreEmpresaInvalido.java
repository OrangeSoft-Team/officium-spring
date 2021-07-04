package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionTamanoNombreEmpresaInvalido extends RuntimeException{
    public ExcepcionTamanoNombreEmpresaInvalido(){
        super("El nombre debe tener entre 2 y 128 caracteres");
    }
}
