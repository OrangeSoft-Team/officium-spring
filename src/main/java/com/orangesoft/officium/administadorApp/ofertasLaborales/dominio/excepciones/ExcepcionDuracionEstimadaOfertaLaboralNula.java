package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionDuracionEstimadaOfertaLaboralNula extends MalaSolicitudExcepcion {
    public ExcepcionDuracionEstimadaOfertaLaboralNula() {
        super("La duracion estimada no puede ser nula");
    }
}
