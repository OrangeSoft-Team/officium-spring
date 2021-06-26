package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionIdCiudadNulo extends RuntimeException{
    public ExcepcionIdCiudadNulo() {
        super("El id de la ciudad no puede ser nulo");
    }
}
