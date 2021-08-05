package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionTamanoTituloOfertaLaboralInvalido extends MalaSolicitudExcepcion {
    public ExcepcionTamanoTituloOfertaLaboralInvalido() {
        super("El tamaño del titulo de la oferta laboral no es valido");
    }
}
