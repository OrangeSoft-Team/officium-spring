package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionCantidadDuracionEstimadaValorInvalido extends RuntimeException {
    public ExcepcionCantidadDuracionEstimadaValorInvalido(){
        super("La duracion estimada valor de ser mayor a 0 y menor o igual a 99");
    }
}
