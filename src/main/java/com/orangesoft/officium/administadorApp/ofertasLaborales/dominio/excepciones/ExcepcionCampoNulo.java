package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionCampoNulo extends RuntimeException{
    public ExcepcionCampoNulo(String campo) {
        super("El campo "+campo+" no puede ser nulo");
    }
}
