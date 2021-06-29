package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionEstadoOfertaLaboralNulo extends RuntimeException {
    public ExcepcionEstadoOfertaLaboralNulo() {
        super("El estado de la oferta laboral no puede ser nulo");
    }
}
