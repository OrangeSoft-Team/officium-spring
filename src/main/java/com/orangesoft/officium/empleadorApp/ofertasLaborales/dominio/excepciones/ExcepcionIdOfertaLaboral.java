package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionIdOfertaLaboral extends RuntimeException{
    public ExcepcionIdOfertaLaboral(){
        super("El id de la oferta laboral no puede ser nulo");
    }
}
