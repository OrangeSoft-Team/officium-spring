package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.Exepciones;

public class ExcepcionPostulacionOfertaLaboralInvalida extends RuntimeException {
    public ExcepcionPostulacionOfertaLaboralInvalida() {
        super("La postulación de la oferta laboral es inválida");
    }
}
