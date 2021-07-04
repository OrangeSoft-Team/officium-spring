package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.comun.persistencia.empleado.PersistenciaEmpleado;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;

public class TuplaPersistenciaOfertaLaboralEmpleado extends Tupla<PersistenciaOfertaLaboral, PersistenciaEmpleado> {
    public TuplaPersistenciaOfertaLaboralEmpleado(PersistenciaOfertaLaboral firstElement, PersistenciaEmpleado secondElement) {
        super(firstElement, secondElement);
    }
}
