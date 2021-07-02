package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionTurnoTrabajoOfertaLaboralNulo;
import com.orangesoft.officium.empleadoApp.turnoTrabajo.dominio.EnumTurnoTrabajo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajoOfertaLaboral {
    private final EnumTurnoTrabajo turnoTrabajo;

    public TurnoTrabajoOfertaLaboral(EnumTurnoTrabajo turnoTrabajo) {
        validarTurnoTrabajo(turnoTrabajo);
        this.turnoTrabajo = turnoTrabajo;
    }

    private void validarTurnoTrabajo(EnumTurnoTrabajo turnoTrabajo) {
        if(turnoTrabajo == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo() ;
    }
}
