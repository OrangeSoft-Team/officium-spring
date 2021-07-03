package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionLongitudNombrePaisInvalido extends RuntimeException {
    public ExcepcionLongitudNombrePaisInvalido() {
        super("El nombre del pais debe contener entre 2 y 128 letras");
    }
}
