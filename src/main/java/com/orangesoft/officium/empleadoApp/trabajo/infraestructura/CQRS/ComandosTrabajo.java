package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS;

import java.util.UUID;

public interface ComandosTrabajo {
    public void renunciarTrabajo(UUID idEmpleado, UUID idTrabajo);
}
