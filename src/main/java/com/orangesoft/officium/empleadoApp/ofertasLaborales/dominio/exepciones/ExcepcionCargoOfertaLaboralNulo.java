package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionCargoOfertaLaboralNulo extends RuntimeException {
    public ExcepcionCargoOfertaLaboralNulo() {
        super("El cargo de la oferta laboral no debe ser nulo" );
    }
}
