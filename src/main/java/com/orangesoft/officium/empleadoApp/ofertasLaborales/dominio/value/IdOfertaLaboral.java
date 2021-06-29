package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionIdOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class IdOfertaLaboral {

    private final String idEmpresa;
    private final String idOfertaLaboral;

    public IdOfertaLaboral(String idEmpresa, String idOfertaLaboral) {
        validarIdOfertaLaboral(idEmpresa, idOfertaLaboral);
        this.idEmpresa = idEmpresa;
        this.idOfertaLaboral = idOfertaLaboral;
    }

    private void validarIdOfertaLaboral(String idEmpresa, String idOfertaLaboral) {
        if(idEmpresa == null || idOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo();
    }

}
