package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoOfertaLaboralInvalido;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoOfertaLaboralNulo;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajoOfertaLaboral {
    private final String turnoTrabajoOfertaLaboral;

    public TurnoTrabajoOfertaLaboral(String turno) {
        if(turno == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo();
        switch (turno) {
            case "mañana": break;
            case "tarde": break;
            case "noche": break;
            default: throw new ExcepcionTurnoTrabajoOfertaLaboralInvalido();
        }
        this.turnoTrabajoOfertaLaboral = turno;
    }
}
