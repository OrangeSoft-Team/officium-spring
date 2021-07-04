package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoOfertaLaboralInvalido;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoOfertaLaboralNulo;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajoOfertaLaboral {
    private final String turnoTrabajoOfertaLaboral;

    public TurnoTrabajoOfertaLaboral(Integer turno) {
        if(turno == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo();
        if (turno < 1 || turno > 3)
            throw new ExcepcionTurnoTrabajoOfertaLaboralInvalido();
        switch (turno) {
            case 1: this.turnoTrabajoOfertaLaboral = "mañana";
                break;
            case 2: this.turnoTrabajoOfertaLaboral = "tarde";
                break;
            default: this.turnoTrabajoOfertaLaboral = "noche";
                break;
        }
    }
}
