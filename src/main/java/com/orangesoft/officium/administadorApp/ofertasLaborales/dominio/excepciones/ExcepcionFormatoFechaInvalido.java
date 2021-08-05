package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionFormatoFechaInvalido extends MalaSolicitudExcepcion {
    public ExcepcionFormatoFechaInvalido() {
        super("El formato de la fecha es incorrecto");
    }
}
