package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionLongitudNombreEmpresaInvalido;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionNombreEmpresaNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NombreEmpresa {
    private final String nombreEmpresa;

    public NombreEmpresa(String nombreEmpresa) {
        validarNombreEmpresa(nombreEmpresa);
        this.nombreEmpresa = nombreEmpresa;
    }

    private void validarNombreEmpresa(String nombreEmpresa) {
        if(nombreEmpresa == null)
            throw new ExcepcionNombreEmpresaNulo();
        if(nombreEmpresa.length() < 4 || nombreEmpresa.length() > 128)
            throw new ExcepcionLongitudNombreEmpresaInvalido();
    }
}
