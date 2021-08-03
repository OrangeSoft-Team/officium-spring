package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionTurnoTrabajoOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajoOfertaLaboral {
    private final EnumTurnoOfertaLaboral turnoTrabajo;

    public TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral turnoTrabajo) {
        validarTurnoTrabajo(turnoTrabajo);
        this.turnoTrabajo = turnoTrabajo;
    }

    private void validarTurnoTrabajo(EnumTurnoOfertaLaboral turnoTrabajo) {
        if(turnoTrabajo == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo() ;
    }
}
