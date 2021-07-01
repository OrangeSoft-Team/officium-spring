package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionMonedaOfertaLaboralNula extends RuntimeException {
    public ExcepcionMonedaOfertaLaboralNula () {
        super("La moneda de una oferta laboral no puede ser nula" );
    }
}
