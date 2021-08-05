package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionNumeroVacantesLaboralInvalido extends MalaSolicitudExcepcion {
    public ExcepcionNumeroVacantesLaboralInvalido() {
        super("El valor de vacantes de la oferta laboral es invalido");
    }
}
