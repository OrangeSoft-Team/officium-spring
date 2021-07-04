package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionIdOfertaLaboralNulo;

@EqualsAndHashCode
@Getter
public final class IdOfertaLaboral {
    private final String idOfertaLaboral;

    public IdOfertaLaboral(String idOfertaLaboral) {
        if(idOfertaLaboral == null || idOfertaLaboral.isEmpty())
            throw new ExcepcionIdOfertaLaboralNulo();
        this.idOfertaLaboral = idOfertaLaboral;
    }
}
