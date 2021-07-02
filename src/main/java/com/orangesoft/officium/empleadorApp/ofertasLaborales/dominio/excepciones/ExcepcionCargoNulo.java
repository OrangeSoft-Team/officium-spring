package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionCargoNulo extends RuntimeException{
    public ExcepcionCargoNulo(){
        super("El cargo no puede ser nulo");
    }
}
