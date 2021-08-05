package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionDescripcionOfertaTrabajoNula extends MalaSolicitudExcepcion {
    public ExcepcionDescripcionOfertaTrabajoNula() {
        super("Descripcion de la oferta laboral no puede ser nula");
    }
}
