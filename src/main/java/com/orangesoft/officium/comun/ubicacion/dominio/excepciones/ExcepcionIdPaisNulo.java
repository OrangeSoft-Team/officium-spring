package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionIdPaisNulo extends RuntimeException{
    public ExcepcionIdPaisNulo() {
        super("El id del pais no puede ser nulo");
    }
}
