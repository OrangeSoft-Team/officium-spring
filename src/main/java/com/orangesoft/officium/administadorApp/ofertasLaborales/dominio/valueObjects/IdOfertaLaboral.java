package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionIdOfertaLaboralNulo;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdOfertaLaboral {
    private final UUID idOfertaLaboral;

    public IdOfertaLaboral(UUID idOfertaLaboral) {
        if(idOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo();
        this.idOfertaLaboral = idOfertaLaboral;
    }
}
