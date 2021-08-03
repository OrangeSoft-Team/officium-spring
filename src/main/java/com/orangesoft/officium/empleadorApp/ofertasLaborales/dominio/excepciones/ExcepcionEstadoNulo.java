package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionEstadoNulo extends RuntimeException{
    public ExcepcionEstadoNulo(){
        super("El estado de la oferta no puede ser nulo");
    }
}
