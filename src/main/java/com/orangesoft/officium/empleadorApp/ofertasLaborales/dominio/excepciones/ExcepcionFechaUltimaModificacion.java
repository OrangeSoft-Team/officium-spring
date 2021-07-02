package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionFechaUltimaModificacion extends RuntimeException{
    public ExcepcionFechaUltimaModificacion(){
        super("La ultima fecha de modificacion no puede ser nulo");
    }
}
