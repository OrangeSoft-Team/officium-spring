package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdEmpresa {
    private final UUID idEmpresa;

    public IdEmpresa(UUID idEmpresa) {
        validarIdEmpresa(idEmpresa);
        this.idEmpresa = idEmpresa;
    }

    private void validarIdEmpresa(UUID idEmpresa) {
        if(idEmpresa == null)
            throw new ExcepcionIdEmpresaNulo();
    }
}
