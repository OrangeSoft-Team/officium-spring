package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionDescripcionOfertaLaboraNula extends RuntimeException {
    public ExcepcionDescripcionOfertaLaboraNula() {
        super("La descripcion de la oferta laboral no puede ser nula");
    }
}
