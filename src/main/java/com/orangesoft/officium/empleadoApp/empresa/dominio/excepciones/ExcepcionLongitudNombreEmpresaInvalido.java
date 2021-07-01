package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionLongitudNombreEmpresaInvalido extends RuntimeException {
    public ExcepcionLongitudNombreEmpresaInvalido() {
        super("La longitud del nombre de una empresa debe estar entre 4 y 128 caracteres");
    }
}
