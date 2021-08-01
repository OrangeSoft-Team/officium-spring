package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionCodigoPostalDireccionNulo extends RuntimeException {
    public ExcepcionCodigoPostalDireccionNulo() {
        super("El código postal de una direccion no puede ser nulo o esta vacio");
    }
}
