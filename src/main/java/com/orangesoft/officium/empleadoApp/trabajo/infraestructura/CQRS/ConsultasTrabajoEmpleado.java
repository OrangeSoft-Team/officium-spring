package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS;

import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.DetalleTrabajoEmpleadoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;

import java.util.List;
import java.util.UUID;

public interface ConsultasTrabajoEmpleado {
    public List<TrabajosEmpleadoDTO> obtenerTrabajosEmpleado(UUID idEmpleado);
    public DetalleTrabajoEmpleadoDTO obtenerDetalleTrabajo(UUID uuid);
}
