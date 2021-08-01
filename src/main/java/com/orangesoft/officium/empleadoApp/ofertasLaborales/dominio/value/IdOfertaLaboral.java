package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionIdOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdOfertaLaboral {

    private final UUID idOfertaLaboral;

    public IdOfertaLaboral(UUID idOfertaLaboral) {
        validarIdOfertaLaboral(idOfertaLaboral);
        this.idOfertaLaboral = idOfertaLaboral;
    }

    private void validarIdOfertaLaboral(UUID idOfertaLaboral) {
        if(idOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo() ;
    }

}
