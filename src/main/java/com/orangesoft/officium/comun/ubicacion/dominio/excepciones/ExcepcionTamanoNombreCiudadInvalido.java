package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionTamanoNombreCiudadInvalido extends RuntimeException {
    public ExcepcionTamanoNombreCiudadInvalido() {
        super("El nombre de una ciudad debe contener entre 2 y 128 letras");
    }
}
