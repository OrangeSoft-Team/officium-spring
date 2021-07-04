package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionFechaNula extends RuntimeException{
    public ExcepcionFechaNula() {
        super("La fecha no puede ser nula");
    }
}
