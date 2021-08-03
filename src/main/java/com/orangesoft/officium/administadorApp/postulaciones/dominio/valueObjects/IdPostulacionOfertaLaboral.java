package com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdPostulacionOfertaLaboral {
    private UUID uuid;

    public IdPostulacionOfertaLaboral (UUID uuid){
        if (uuid == null){
            throw new ExcepcionCampoNulo("uuid postulacion");
        }
        this.uuid = uuid;
    }
}
