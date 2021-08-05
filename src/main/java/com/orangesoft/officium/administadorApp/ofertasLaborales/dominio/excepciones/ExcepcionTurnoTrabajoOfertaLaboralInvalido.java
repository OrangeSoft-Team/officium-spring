package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionTurnoTrabajoOfertaLaboralInvalido extends MalaSolicitudExcepcion {
    public ExcepcionTurnoTrabajoOfertaLaboralInvalido() {
        super("El valor del turno de trabajo de la oferta laboral es invalido");
    }
}
