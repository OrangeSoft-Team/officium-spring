package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionNumeroVacantesLaboralInvalido extends RuntimeException{
    public ExcepcionNumeroVacantesLaboralInvalido() {
        super("El valor de vacantes de la oferta laboral es invalido");
    }
}
