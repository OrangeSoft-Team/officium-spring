package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionNombreEstadoNulo extends RuntimeException{
    public ExcepcionNombreEstadoNulo() {
        super("El nombre del estado no puede ser nulo");
    }
}
