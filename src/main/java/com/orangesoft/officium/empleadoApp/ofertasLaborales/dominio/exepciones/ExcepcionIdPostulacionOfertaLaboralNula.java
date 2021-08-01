package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionIdPostulacionOfertaLaboralNula extends RuntimeException{
    public ExcepcionIdPostulacionOfertaLaboralNula() {
        super("El identificador de la oferta laboral no puede ser nulo");
    }
}
