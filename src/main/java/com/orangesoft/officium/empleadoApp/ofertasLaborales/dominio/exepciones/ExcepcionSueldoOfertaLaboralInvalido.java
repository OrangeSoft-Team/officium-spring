package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionSueldoOfertaLaboralInvalido extends RuntimeException {
    public ExcepcionSueldoOfertaLaboralInvalido () {
        super("El sueldo de una oferta laboral no puede ser nulo o negativo" );
    }
}
