package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTamanoTituloInvalido extends RuntimeException{
    public ExcepcionTamanoTituloInvalido(){ super("El titulo de la oferta labora debe ser mayor a 4  y menor a 80 caracteres ");}
}
