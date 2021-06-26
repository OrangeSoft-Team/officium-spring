package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionIdEstadoNulo extends RuntimeException{
    public ExcepcionIdEstadoNulo() {
        super("El id del estado no puede ser nulo");
    }
}
