package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionNumeroVacantesInvalido extends RuntimeException {
    public ExcepcionNumeroVacantesInvalido() {
        super("El número de vacantes para la oferta laboral debe ser un número entro positivo menor 100" );
    }
}
