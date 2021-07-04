package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;

@EqualsAndHashCode
@Getter
public final class EstadoOfertaLaboral {
    private final EnumEstadoOfertaLaboral estadoOfertaLaboral;

    public EstadoOfertaLaboral(EnumEstadoOfertaLaboral estadoOfertaLaboral) {
        validarEstadoOfertaLabaral(estadoOfertaLaboral);
        this.estadoOfertaLaboral = estadoOfertaLaboral;
    }

    private void validarEstadoOfertaLabaral(EnumEstadoOfertaLaboral estadoOfertaLaboral) {
        if(estadoOfertaLaboral == null)
            throw new ExcepcionCampoNulo("estado");
    }
}
