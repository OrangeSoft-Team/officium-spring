package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoOfertaLaboralInvalido;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoOfertaLaboralNulo;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajoOfertaLaboral {
    private final EnumTurnoOfertaLaboral turnoTrabajoOfertaLaboral;

    public TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral turno) {
        if(turno == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo();
        this.turnoTrabajoOfertaLaboral = turno;
    }
}
