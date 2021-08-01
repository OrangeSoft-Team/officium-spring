package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionEstadoPostulacionOfertaLaboralNula extends RuntimeException {
    public ExcepcionEstadoPostulacionOfertaLaboralNula() {
        super("El estado de la postulación oferta laboral no puede ser nulo");
    }
}
