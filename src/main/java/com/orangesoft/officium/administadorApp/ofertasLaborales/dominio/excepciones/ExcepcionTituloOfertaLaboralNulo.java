package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTituloOfertaLaboralNulo extends RuntimeException{
    public ExcepcionTituloOfertaLaboralNulo() {
        super("El titulo de la oferta laboral no puede ser nulo");
    }
}
