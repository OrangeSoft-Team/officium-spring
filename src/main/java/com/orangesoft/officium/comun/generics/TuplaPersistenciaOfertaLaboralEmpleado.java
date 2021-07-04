package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.empleadoApp.empleado.infraestructura.persistencia.entidades.PersistenciaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;

public class TuplaPersistenciaOfertaLaboralEmpleado extends Tupla<PersistenciaOfertaLaboral, PersistenciaEmpleado> {
    public TuplaPersistenciaOfertaLaboralEmpleado(PersistenciaOfertaLaboral firstElement, PersistenciaEmpleado secondElement) {
        super(firstElement, secondElement);
    }
}
