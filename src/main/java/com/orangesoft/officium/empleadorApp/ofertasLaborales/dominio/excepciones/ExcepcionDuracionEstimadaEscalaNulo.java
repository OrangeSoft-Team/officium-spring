package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionDuracionEstimadaEscalaNulo extends RuntimeException{
    public ExcepcionDuracionEstimadaEscalaNulo(){
        super(" La duracion estimada escala de la oferta no puede ser nulo");
    }
}
