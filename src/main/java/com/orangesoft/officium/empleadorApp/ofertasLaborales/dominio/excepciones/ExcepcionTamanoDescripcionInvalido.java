package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTamanoDescripcionInvalido extends RuntimeException{
    public ExcepcionTamanoDescripcionInvalido(){
        super("La descripcion de la oferta debe tener entre 32 y 512 caracteres");
    }
}
