package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionCantidadSueldoInvalida extends RuntimeException{
    public ExcepcionCantidadSueldoInvalida(){
        super("el sueldo debe ser mayor a 0 y menor o igual a 1.000.000");
    }
}
