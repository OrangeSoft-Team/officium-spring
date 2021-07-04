package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;

public class EstadoOfertaLaboral {
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
