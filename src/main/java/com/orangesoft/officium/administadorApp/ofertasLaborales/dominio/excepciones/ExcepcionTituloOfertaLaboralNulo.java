package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionTituloOfertaLaboralNulo extends MalaSolicitudExcepcion {
    public ExcepcionTituloOfertaLaboralNulo() {
        super("El titulo de la oferta laboral no puede ser nulo");
    }
}
