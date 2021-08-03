package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionNumeroVacantesNulo extends RuntimeException{
    public ExcepcionNumeroVacantesNulo(){
        super("El numero de vacantes no puede ser nulo");
    }
}
