package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionIdOfertaLaboral;
import lombok.EqualsAndHashCode;
import lombok.Getter;
@EqualsAndHashCode
@Getter
public class IdOfertaLaboral {
    private final String idOfertaLaboral;

    public IdOfertaLaboral(String idOfertaLaboral){
        if(idOfertaLaboral == null ||idOfertaLaboral.isEmpty())
            throw new ExcepcionIdOfertaLaboral();
        this.idOfertaLaboral=idOfertaLaboral;

    }
}
