package com.orangesoft.officium.empleadoApp.trabajo.dominio.values;

import com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones.ExcepcionDuracionTrabajoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;

@EqualsAndHashCode
@Getter
public final class DuracionTrabajo {
    private final Instant fechaInicio;
    private final Instant fechaFin;

    public DuracionTrabajo(Instant fechaInicio, Instant fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        validarDuracionTrabajo();
    }

    private void validarDuracionTrabajo() {
        if(fechaFin.isBefore(fechaFin))
            throw new ExcepcionDuracionTrabajoNulo();
    }
}
