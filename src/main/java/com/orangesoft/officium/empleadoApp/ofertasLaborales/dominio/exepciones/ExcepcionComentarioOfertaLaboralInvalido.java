package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionComentarioOfertaLaboralInvalido extends RuntimeException{
    public ExcepcionComentarioOfertaLaboralInvalido() {
        super("El comentario de la oferta laboral no puede exceder los 256 caracteres");
    }
}
