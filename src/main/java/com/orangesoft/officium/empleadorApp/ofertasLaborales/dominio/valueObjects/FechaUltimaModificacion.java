package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;

@EqualsAndHashCode
@Getter
public class FechaUltimaModificacion {
    private final Instant fechaUltimaPublicacion;

    public FechaUltimaModificacion(Instant fechaUltimaPublicacion){
        this.fechaUltimaPublicacion=fechaUltimaPublicacion;
    }
}
