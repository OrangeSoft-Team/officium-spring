package com.orangesoft.officium.empleadoApp.trabajo.aplicacion.entrada;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;

public interface CasoDeUsoRenunciarTrabajoEmpleado {
    public void renunciarTrabajoEmpleado(IdEmpleado idEmpleado, IdTrabajoEmpleado idTrabajoEmpleado);
}
