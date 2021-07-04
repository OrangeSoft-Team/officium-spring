package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionDuracionEstimadaOfertaLaboralNula;

@EqualsAndHashCode
@Getter
public final class DuracionEstimadaOfertaLaboral {
    private final int duracionEstimadaOfertaLaboral;
    private final PeriodoTiempo periodoTiempoOfertaLaboral;

    public DuracionEstimadaOfertaLaboral(int duracionEstimadaOfertaLaboral, PeriodoTiempo periodoTiempo) {
        if(duracionEstimadaOfertaLaboral == 0 || periodoTiempo == null)
            throw new ExcepcionDuracionEstimadaOfertaLaboralNula();

        this.duracionEstimadaOfertaLaboral = duracionEstimadaOfertaLaboral;
        this.periodoTiempoOfertaLaboral = periodoTiempo;
    }
}
