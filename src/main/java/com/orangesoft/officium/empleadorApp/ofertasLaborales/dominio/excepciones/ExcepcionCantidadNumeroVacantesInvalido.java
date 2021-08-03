package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionCantidadNumeroVacantesInvalido extends RuntimeException{
    public ExcepcionCantidadNumeroVacantesInvalido(){
        super("El numero de vacantes debe ser mayor a 0 y menor o igual a 99");
    }
}
