package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;

public class TuplaOfertaLaboralEmpleado extends Tupla<OfertaLaboral, Empleado> {
    public TuplaOfertaLaboralEmpleado(OfertaLaboral firstElement, Empleado secondElement) {
        super(firstElement, secondElement);
    }
}
