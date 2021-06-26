package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionNombrePaisNulo extends RuntimeException {

    public ExcepcionNombrePaisNulo() {
        super("El nombre del pais no puede ser nulo");
    }
}
