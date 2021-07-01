package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionFechaUltimaModificacionInvalida extends RuntimeException {
    public ExcepcionFechaUltimaModificacionInvalida() {
        super("La fecha de ultima modificación no puede ser menor a la fecha de publicación" );
    }
}
