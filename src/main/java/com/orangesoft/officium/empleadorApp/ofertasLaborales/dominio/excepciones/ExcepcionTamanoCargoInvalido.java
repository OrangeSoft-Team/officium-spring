package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTamanoCargoInvalido extends RuntimeException{
    public ExcepcionTamanoCargoInvalido(){
        super("El cargo debe tener mas de 4 y menos de 40 caracteres");
    }
}
