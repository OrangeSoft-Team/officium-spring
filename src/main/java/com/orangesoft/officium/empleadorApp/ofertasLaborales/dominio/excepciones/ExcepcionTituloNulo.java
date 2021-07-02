package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTituloNulo extends  RuntimeException{
    public ExcepcionTituloNulo(){
        super("El nombre del titulo no puede ser nulo");
    }
}
