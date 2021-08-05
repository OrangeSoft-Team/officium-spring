package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionIdOfertaLaboralNulo extends MalaSolicitudExcepcion {
    public ExcepcionIdOfertaLaboralNulo() {
        super("El id de la oferta laboral no puede ser nulo");
    }
}
