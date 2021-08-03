package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionSueldoNulo extends RuntimeException{
    public ExcepcionSueldoNulo(){
        super("El sueldo no puede ser nulo");
    }
}
