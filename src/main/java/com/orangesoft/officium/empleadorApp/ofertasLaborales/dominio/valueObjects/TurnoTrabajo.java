package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajo {
    private final EnumTurnoTrabajo turnoTrabajo;

    public TurnoTrabajo(EnumTurnoTrabajo turnoTrabajo){
       validarTurnoTrabajo(turnoTrabajo);
        this.turnoTrabajo=turnoTrabajo;
    }
    private void validarTurnoTrabajo(EnumTurnoTrabajo turnoTrabajo){
        if(turnoTrabajo==null)
            throw new ExcepcionTurnoTrabajoNulo();
    }
}
