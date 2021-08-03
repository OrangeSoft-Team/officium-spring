package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionComentarioPostulacionOfertaLaboralInvalido extends RuntimeException {
    public ExcepcionComentarioPostulacionOfertaLaboralInvalido() {
        super("El comentario de la postulacion de la oferta laboral no puede exceder los 256 caracteres");
    }
}
