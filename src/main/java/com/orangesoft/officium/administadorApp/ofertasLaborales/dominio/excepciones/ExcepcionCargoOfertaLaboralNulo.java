package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionCargoOfertaLaboralNulo extends MalaSolicitudExcepcion {
    public ExcepcionCargoOfertaLaboralNulo() {
        super("El cargo de la oferta laboral no puede ser nulo");
    }
}
