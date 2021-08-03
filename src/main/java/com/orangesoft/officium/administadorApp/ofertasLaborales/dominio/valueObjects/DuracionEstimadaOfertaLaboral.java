package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionDuracionEstimadaOfertaLaboralNula;

@EqualsAndHashCode
@Getter
public final class DuracionEstimadaOfertaLaboral {
    private final int duracionEstimadaOfertaLaboral;
    private final EnumEscalaDuracionOfertaLaboral periodoTiempoOfertaLaboral;

    public DuracionEstimadaOfertaLaboral(int duracionEstimadaOfertaLaboral, EnumEscalaDuracionOfertaLaboral periodoTiempo) {
        if(duracionEstimadaOfertaLaboral == 0 || periodoTiempo == null)
            throw new ExcepcionDuracionEstimadaOfertaLaboralNula();

        this.duracionEstimadaOfertaLaboral = duracionEstimadaOfertaLaboral;
        this.periodoTiempoOfertaLaboral = periodoTiempo;
    }
}
