package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTurnoTrabajoOfertaLaboralNulo extends RuntimeException{
    public ExcepcionTurnoTrabajoOfertaLaboralNulo() {
        super("El turno de la oferta laboral no puede ser nulo");
    }
}
