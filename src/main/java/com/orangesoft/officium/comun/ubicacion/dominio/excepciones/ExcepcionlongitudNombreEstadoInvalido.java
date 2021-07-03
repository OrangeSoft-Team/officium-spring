package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionlongitudNombreEstadoInvalido extends RuntimeException {
    public ExcepcionlongitudNombreEstadoInvalido() {
        super("El nombre de un estado debe contener entre 2 y 128 letras");
    }
}
