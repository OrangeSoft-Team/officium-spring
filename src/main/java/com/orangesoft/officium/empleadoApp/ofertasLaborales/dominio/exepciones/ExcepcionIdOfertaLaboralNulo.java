package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionIdOfertaLaboralNulo extends RuntimeException {
    public ExcepcionIdOfertaLaboralNulo() {
        super("El identificador de una oferta laboral no puede ser nulo" );
    }
}
