package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionFechaUltimaModificacionNula extends RuntimeException {
    public ExcepcionFechaUltimaModificacionNula () {
        super("La fecha de última modificación no puede ser nula" );
    }
}
