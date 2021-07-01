package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionLongitudDescripcionOfertaLaboral extends RuntimeException {
    public ExcepcionLongitudDescripcionOfertaLaboral() {
        super("La longitud de la oferta laboral debe estar entre 32 y 512 caracteres" );
    }
}
