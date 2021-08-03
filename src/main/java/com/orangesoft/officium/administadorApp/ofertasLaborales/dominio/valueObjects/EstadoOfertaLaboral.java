package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;

@EqualsAndHashCode
@Getter
public final class EstadoOfertaLaboral {
    private final EnumEstatusOfertaLaboral estadoOfertaLaboral;

    public EstadoOfertaLaboral(EnumEstatusOfertaLaboral estadoOfertaLaboral) {
        validarEstadoOfertaLabaral(estadoOfertaLaboral);
        this.estadoOfertaLaboral = estadoOfertaLaboral;
    }

    private void validarEstadoOfertaLabaral(EnumEstatusOfertaLaboral estadoOfertaLaboral) {
        if(estadoOfertaLaboral == null)
            throw new ExcepcionCampoNulo("estado");
    }
}
