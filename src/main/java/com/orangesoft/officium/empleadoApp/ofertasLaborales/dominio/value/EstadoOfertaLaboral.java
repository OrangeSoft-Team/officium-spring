package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.estadoOfertaLaboral.dominio.EnumEstadoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionEstadoOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

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
            throw new ExcepcionEstadoOfertaLaboralNulo();
    }
}
