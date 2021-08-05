package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;

public class ExcepcionSueldoOfertaLaboralInvalido extends MalaSolicitudExcepcion {
    public ExcepcionSueldoOfertaLaboralInvalido() {
        super("El valor del sueldo debe ser mayor o igual a cero");
    }
}
