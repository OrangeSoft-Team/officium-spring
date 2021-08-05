package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionNumeroVacantesOfertaLaboralNulo extends MalaSolicitudExcepcion {
    public ExcepcionNumeroVacantesOfertaLaboralNulo() {
        super("El valor de vacantes de la oferta laboral no puede ser nulo");
    }
}
