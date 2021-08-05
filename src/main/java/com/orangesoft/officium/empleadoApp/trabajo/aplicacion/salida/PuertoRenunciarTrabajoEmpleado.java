package com.orangesoft.officium.empleadoApp.trabajo.aplicacion.salida;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;

public interface PuertoRenunciarTrabajoEmpleado {
    public void renunciarTrabajoEmpleado(IdTrabajoEmpleado idTrabajoEmpleado);
    public boolean lePerteneceOfertaLaboral(IdEmpleado idEmpleado, IdTrabajoEmpleado idTrabajoEmpleado);
}
