package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionSueldoOfertaLaboralNulo extends RuntimeException {
    public ExcepcionSueldoOfertaLaboralNulo () {
        super("El sueldo de la oferta laboral no puede ser nulo" );
    }
}
