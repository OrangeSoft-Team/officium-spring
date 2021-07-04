package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionFormatoFechaInvalido extends RuntimeException{
    public ExcepcionFormatoFechaInvalido() {
        super("El formato de la fecha es incorrecto");
    }
}
