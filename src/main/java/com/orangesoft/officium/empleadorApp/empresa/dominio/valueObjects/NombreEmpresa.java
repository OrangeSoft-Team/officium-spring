package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionNombreEmpresaNulo;
import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionTamanoNombreEmpresaInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class NombreEmpresa {
    private final String nombreEmpresa;

    public NombreEmpresa(String nombreEmpresa) {
        validarNombreEmpresa(nombreEmpresa);
        this.nombreEmpresa = nombreEmpresa;
    }

    private void validarNombreEmpresa(String direccionEmpresa) {
        if(direccionEmpresa == null)
            throw new ExcepcionNombreEmpresaNulo();
        if(nombreEmpresa.length() < 4 || nombreEmpresa.length() > 128)
            throw new ExcepcionTamanoNombreEmpresaInvalido();
    }

}

