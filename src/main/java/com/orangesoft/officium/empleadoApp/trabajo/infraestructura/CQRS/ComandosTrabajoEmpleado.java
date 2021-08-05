package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS;

import java.util.UUID;

public interface ComandosTrabajoEmpleado {
    public void renunciarTrabajo(UUID idEmpleado, UUID idTrabajo);
}
