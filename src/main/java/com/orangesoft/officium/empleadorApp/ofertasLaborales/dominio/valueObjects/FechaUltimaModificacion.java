package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class FechaUltimaModificacion {
    private final String fechaUltimaPublicacion;

    public FechaUltimaModificacion(String fechaUltimaPublicacion){
        this.fechaUltimaPublicacion=fechaUltimaPublicacion;

    }
}
