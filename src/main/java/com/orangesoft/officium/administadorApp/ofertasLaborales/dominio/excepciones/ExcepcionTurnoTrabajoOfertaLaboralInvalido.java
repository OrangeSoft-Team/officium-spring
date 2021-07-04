package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTurnoTrabajoOfertaLaboralInvalido extends RuntimeException{
    public ExcepcionTurnoTrabajoOfertaLaboralInvalido() {
        super("El valor del turno de trabajo de la oferta laboral es invalido");
    }
}
