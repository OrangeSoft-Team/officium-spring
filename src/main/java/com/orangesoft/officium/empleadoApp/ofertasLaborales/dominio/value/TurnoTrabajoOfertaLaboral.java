package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionTurnoTrabajoOfertaLaboralNulo;
import com.orangesoft.officium.empleadoApp.turnoTrabajo.dominio.TurnoTrabajo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajoOfertaLaboral {
    private final TurnoTrabajo turnoTrabajo;

    public TurnoTrabajoOfertaLaboral(TurnoTrabajo turnoTrabajo) {
        validarTurnoTrabajo(turnoTrabajo);
        this.turnoTrabajo = turnoTrabajo;
    }

    private void validarTurnoTrabajo(TurnoTrabajo turnoTrabajo) {
        if(turnoTrabajo == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo();
    }
}
