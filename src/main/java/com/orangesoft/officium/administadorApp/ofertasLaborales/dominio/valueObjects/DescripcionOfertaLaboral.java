package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionDescripcionOfertaTrabajoNula;

@EqualsAndHashCode
@Getter
public final class DescripcionOfertaLaboral {
    private final String descripcionOfertaLaboral;

    public DescripcionOfertaLaboral(String descripcionOfertaLaboral) {
        if(descripcionOfertaLaboral == null || descripcionOfertaLaboral.isEmpty())
            throw new ExcepcionDescripcionOfertaTrabajoNula();

        this.descripcionOfertaLaboral = descripcionOfertaLaboral;
    }
}
