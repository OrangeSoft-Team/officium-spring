package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionDuracionEstimaOfertaLaboralInvalida extends RuntimeException {
    public ExcepcionDuracionEstimaOfertaLaboralInvalida() {
        super("La duración estimada de la oferta laboral debe ser un número entero positivo menor a 100");
    }
}
