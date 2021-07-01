package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class IdEmpresa {
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
