package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionLongitudNombreCiudadInvalido extends RuntimeException {
    public ExcepcionLongitudNombreCiudadInvalido() {
        super("El nombre de una ciudad debe contener entre 2 y 128 letras");
    }
}
