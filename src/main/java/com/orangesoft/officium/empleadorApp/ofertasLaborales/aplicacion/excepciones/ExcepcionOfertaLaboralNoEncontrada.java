package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.excepciones;

public class ExcepcionOfertaLaboralNoEncontrada extends  RuntimeException{
    public ExcepcionOfertaLaboralNoEncontrada(){
        super("Oferta Laboral no se encuentra");
    }
}
