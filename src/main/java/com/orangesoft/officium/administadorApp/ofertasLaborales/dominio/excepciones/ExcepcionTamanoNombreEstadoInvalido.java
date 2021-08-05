package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionTamanoNombreEstadoInvalido extends MalaSolicitudExcepcion {
    public ExcepcionTamanoNombreEstadoInvalido() {
        super("Tamaño del nombre inválido");
    }
}
