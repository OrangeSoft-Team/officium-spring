package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionFechaPublicacionOfertaLaboralNula extends RuntimeException {
    public ExcepcionFechaPublicacionOfertaLaboralNula() {
        super("La fecha de publicación de la oferta laboral no puede ser nula" );
    }
}
