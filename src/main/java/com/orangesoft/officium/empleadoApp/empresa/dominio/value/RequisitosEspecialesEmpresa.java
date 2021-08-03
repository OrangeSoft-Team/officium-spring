package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class RequisitosEspecialesEmpresa {
    private final String requisitosEspeciales;

    public RequisitosEspecialesEmpresa(String requisitosEspeciales) {
        this.requisitosEspeciales = requisitosEspeciales;
    }
}
