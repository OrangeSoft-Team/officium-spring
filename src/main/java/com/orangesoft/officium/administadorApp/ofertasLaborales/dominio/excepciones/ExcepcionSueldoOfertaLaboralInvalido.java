package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionSueldoOfertaLaboralInvalido extends RuntimeException{
    public ExcepcionSueldoOfertaLaboralInvalido() {
        super("El valor del sueldo debe ser mayor o igual a cero");
    }
}
