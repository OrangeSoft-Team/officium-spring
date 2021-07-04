package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionDescripcionOfertaTrabajoNula extends RuntimeException {
    public ExcepcionDescripcionOfertaTrabajoNula() {
        super("Descripcion de la oferta laboral no puede ser nula");
    }
}
