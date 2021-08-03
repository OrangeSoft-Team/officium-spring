package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionEstadoOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

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
            throw new ExcepcionEstadoOfertaLaboralNulo();
    }
}
