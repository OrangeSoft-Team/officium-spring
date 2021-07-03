package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionCodigoPostalEmpresaNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class CodigoPostalEmpresa {
    private final String codigoPostalEmpresa;

    public CodigoPostalEmpresa(String codigoPostalEmpresa) {
        validarCodigoPostalEmpresa(codigoPostalEmpresa);
        this.codigoPostalEmpresa = codigoPostalEmpresa;
    }

    public void validarCodigoPostalEmpresa(String codigoPostalEmpresa) {
        if(codigoPostalEmpresa == null)
            throw new ExcepcionCodigoPostalEmpresaNulo();
    }
}
