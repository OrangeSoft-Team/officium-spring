package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTurnoTrabajoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class TurnoTrabajo {
    private final String turnoTrabajo;

    public TurnoTrabajo(String turnoTrabajo){
        if(turnoTrabajo==null || turnoTrabajo.isEmpty())
            throw new ExcepcionTurnoTrabajoNulo();
        this.turnoTrabajo=turnoTrabajo;
    }
}
