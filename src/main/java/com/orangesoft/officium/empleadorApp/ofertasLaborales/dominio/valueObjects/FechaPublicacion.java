package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class FechaPublicacion {
    private final String fechaPublicacion;

    public FechaPublicacion(String fechaPublicacion){
        
        this.fechaPublicacion=fechaPublicacion;
    }

}
