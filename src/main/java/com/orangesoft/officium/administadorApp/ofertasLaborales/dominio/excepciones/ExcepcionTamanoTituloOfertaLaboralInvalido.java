package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTamanoTituloOfertaLaboralInvalido extends RuntimeException{
    public ExcepcionTamanoTituloOfertaLaboralInvalido() {
        super("El tamaño del titulo de la oferta laboral no es valido");
    }
}
