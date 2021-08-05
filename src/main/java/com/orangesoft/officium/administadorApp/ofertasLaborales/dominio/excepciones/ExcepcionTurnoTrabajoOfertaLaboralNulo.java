package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionTurnoTrabajoOfertaLaboralNulo extends MalaSolicitudExcepcion {
    public ExcepcionTurnoTrabajoOfertaLaboralNulo() {
        super("El turno de la oferta laboral no puede ser nulo");
    }
}
