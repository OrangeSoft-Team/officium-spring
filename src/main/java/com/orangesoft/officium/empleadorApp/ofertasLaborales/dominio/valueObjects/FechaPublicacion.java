package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;

@EqualsAndHashCode
@Getter
public class FechaPublicacion {
    private final Instant fechaPublicacion;

    public FechaPublicacion(Instant fechaPublicacion){
        this.fechaPublicacion=fechaPublicacion;
    }

}
