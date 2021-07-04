package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;

@EqualsAndHashCode
@Getter
public final class FechaPostulacionOfertaLaboral {
    private final Instant fechaPostulacion;

    public FechaPostulacionOfertaLaboral(Instant fechaPostulacion) {
        if(fechaPostulacion == null)
            this.fechaPostulacion = Instant.now();
        else
            this.fechaPostulacion = fechaPostulacion;
    }

}
