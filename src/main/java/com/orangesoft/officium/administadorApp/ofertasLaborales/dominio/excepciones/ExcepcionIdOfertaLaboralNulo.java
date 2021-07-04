package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionIdOfertaLaboralNulo extends RuntimeException{
    public ExcepcionIdOfertaLaboralNulo() {
        super("El id de la oferta laboral no puede ser nulo");
    }
}
