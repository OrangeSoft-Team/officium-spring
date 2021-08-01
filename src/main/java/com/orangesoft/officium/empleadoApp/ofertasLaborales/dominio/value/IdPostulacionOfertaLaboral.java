package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionIdPostulacionOfertaLaboralNula;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdPostulacionOfertaLaboral {
    private final UUID uuid;
    public IdPostulacionOfertaLaboral(UUID uuid) {
        if(uuid == null)
           throw new ExcepcionIdPostulacionOfertaLaboralNula();
        this.uuid = uuid;
    }
}
