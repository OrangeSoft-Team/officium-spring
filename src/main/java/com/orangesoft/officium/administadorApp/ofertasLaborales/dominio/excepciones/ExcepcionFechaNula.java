package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionFechaNula extends MalaSolicitudExcepcion {
    public ExcepcionFechaNula() {
        super("La fecha no puede ser nula");
    }
}
