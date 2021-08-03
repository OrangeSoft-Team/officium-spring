package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionFechaPublicacionNulo extends RuntimeException{
    public ExcepcionFechaPublicacionNulo(){
        super("La fecha de publicacion no puede ser nulo");
    }
}
