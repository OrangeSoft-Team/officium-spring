package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionCantidadDecimalesSueldoInvalida extends RuntimeException{
    public ExcepcionCantidadDecimalesSueldoInvalida(){
        super("El sueldo debe contener solo 2 decimales");
    }
}
