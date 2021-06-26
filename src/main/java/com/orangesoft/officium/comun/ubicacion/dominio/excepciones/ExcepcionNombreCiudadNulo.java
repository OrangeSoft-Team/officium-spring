package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionNombreCiudadNulo extends RuntimeException{
    public ExcepcionNombreCiudadNulo() {
        super("El nombre de la ciudad no puede ser nulo");
    }
}
