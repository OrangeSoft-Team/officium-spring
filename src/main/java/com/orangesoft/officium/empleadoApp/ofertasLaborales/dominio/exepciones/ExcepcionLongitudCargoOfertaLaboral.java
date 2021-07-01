package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionLongitudCargoOfertaLaboral extends RuntimeException {
    public ExcepcionLongitudCargoOfertaLaboral() {
        super("El cargo de una oferta laboral debe estar entre 4 y 40 caracteres" );
    }
}
