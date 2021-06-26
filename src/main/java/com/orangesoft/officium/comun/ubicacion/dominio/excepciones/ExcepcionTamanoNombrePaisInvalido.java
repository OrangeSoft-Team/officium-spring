package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionTamanoNombrePaisInvalido extends RuntimeException {
    public ExcepcionTamanoNombrePaisInvalido () {
        super("El nombre del pais debe contener entre 2 y 128 letras");
    }
}
