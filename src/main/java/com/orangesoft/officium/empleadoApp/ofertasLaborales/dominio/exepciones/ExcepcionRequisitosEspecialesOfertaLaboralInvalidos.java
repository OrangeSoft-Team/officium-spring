package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionRequisitosEspecialesOfertaLaboralInvalidos extends RuntimeException {
    public ExcepcionRequisitosEspecialesOfertaLaboralInvalidos() {
        super("Los requisitos especiales deben no deben superar los 256 caracteres");
    }
}
