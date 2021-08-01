package com.orangesoft.officium.comun.ubicacion.dominio.excepciones;

public class ExcepcionCalleUnoDireccionNula extends RuntimeException {
    public ExcepcionCalleUnoDireccionNula() {
        super("La dirección requiere que se especifique la calle");
    }
}
