package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionDescripcionNulo extends RuntimeException{
    public ExcepcionDescripcionNulo(){
        super("La descripcion de la oferta no puder ser nulo");
    }
}
