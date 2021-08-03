package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class EstatusEmpresa {
    private final String estuatus;

    public EstatusEmpresa(String estuatus) {
        if(estuatus == null || estuatus.length() > 10 || estuatus.isEmpty())
            throw new ExcepcionEstadoEmpresaNulo();
        this.estuatus = estuatus;
    }
}
