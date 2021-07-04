package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionNumeroVacantesOfertaLaboralNulo extends RuntimeException{
    public ExcepcionNumeroVacantesOfertaLaboralNulo() {
        super("El valor de vacantes de la oferta laboral no puede ser nulo");
    }
}
