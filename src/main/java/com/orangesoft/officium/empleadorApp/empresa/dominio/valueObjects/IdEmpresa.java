package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class IdEmpresa {
    private final String idEmpresa;

    public IdEmpresa(String idEmpresa) {
        validarIdEmpresa(idEmpresa);
        this.idEmpresa = idEmpresa;
    }

    private void validarIdEmpresa(String idEmpresa) {
        if(idEmpresa == null)
            throw new ExcepcionIdEmpresaNulo();
    }

}
