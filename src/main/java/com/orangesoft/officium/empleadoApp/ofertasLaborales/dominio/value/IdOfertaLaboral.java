package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionIdOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class IdOfertaLaboral {

    private final String idOfertaLaboral;

    public IdOfertaLaboral(String idOfertaLaboral) {
        validarIdOfertaLaboral(idOfertaLaboral);
        this.idOfertaLaboral = idOfertaLaboral;
    }

    private void validarIdOfertaLaboral(String idOfertaLaboral) {
        if(idOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo() ;
    }

}
