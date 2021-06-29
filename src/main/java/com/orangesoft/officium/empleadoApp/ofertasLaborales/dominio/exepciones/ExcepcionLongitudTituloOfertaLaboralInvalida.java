package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionLongitudTituloOfertaLaboralInvalida extends RuntimeException{
    public ExcepcionLongitudTituloOfertaLaboralInvalida() {
        super("La longitud del título de oferta laboral debe estar comprendido entre 4 y 80 caracteres");
    }
}
