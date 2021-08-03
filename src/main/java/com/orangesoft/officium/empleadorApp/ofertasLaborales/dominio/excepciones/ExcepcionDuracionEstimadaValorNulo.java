package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionDuracionEstimadaValorNulo extends RuntimeException{
    public ExcepcionDuracionEstimadaValorNulo(){
        super("La Duracion estimada valor no debe ser nulo");
    }
}
