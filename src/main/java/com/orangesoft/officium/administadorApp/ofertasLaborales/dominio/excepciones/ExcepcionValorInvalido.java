package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionValorInvalido extends MalaSolicitudExcepcion {
    public ExcepcionValorInvalido(String campo) {
        super("El valor introducido al "+campo+" es invalido.");
    }
    public ExcepcionValorInvalido(String campo, String descripcion) {
        super("El valor introducido al "+campo+" es invalido. "+descripcion);
    }
}
