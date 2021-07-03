package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones;

public class ExcepcionOfertaLaboralNoEncontrada extends RuntimeException {
    public ExcepcionOfertaLaboralNoEncontrada() {
        super("La oferta laboral solicitada no existe");
    }
}
