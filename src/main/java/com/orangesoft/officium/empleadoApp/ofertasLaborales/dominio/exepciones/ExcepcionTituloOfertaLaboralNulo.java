package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionTituloOfertaLaboralNulo extends RuntimeException{
    public ExcepcionTituloOfertaLaboralNulo() {
        super("El título de la oferta laboral no puede ser nulo");
    }
}
