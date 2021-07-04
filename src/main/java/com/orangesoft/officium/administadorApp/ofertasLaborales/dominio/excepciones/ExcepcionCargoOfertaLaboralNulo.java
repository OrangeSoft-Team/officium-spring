package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionCargoOfertaLaboralNulo extends RuntimeException{
    public ExcepcionCargoOfertaLaboralNulo() {
        super("El cargo de la oferta laboral no puede ser nulo");
    }
}
