package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionIdDireccionNulo extends RuntimeException {
    public ExcepcionIdDireccionNulo() {
        super("El identificador de la dirección no puedes ser nulo");
    }
}
