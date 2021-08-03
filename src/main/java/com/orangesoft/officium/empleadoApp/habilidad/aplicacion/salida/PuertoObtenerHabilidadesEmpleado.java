package com.orangesoft.officium.empleadoApp.habilidad.aplicacion.salida;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;

import java.util.List;

public interface PuertoObtenerHabilidadesEmpleado {
    public List<Habilidad> obtenerHabilidadesEmpleado(IdEmpleado idEmpleado);
}
