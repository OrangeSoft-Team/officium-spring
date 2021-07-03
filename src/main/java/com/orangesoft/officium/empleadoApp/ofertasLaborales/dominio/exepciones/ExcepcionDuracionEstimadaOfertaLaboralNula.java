package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionDuracionEstimadaOfertaLaboralNula extends RuntimeException {
    public ExcepcionDuracionEstimadaOfertaLaboralNula() {
        super("La duracion estimada de la oferta laboral no puede ser nula" );
    }
}
