package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionCampoNulo extends MalaSolicitudExcepcion {
    public ExcepcionCampoNulo(String campo) {
        super("El campo "+campo+" no puede ser nulo");
    }
}
