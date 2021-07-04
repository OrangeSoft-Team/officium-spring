package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones;

public class ExcepcionOfertaLaboralNoEsDeEsaEmpresa extends RuntimeException{
    public ExcepcionOfertaLaboralNoEsDeEsaEmpresa() {
        super("La oferta laboral solicitada no es de la empresa suministrada");
    }
}
