package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionValorInvalido;

@EqualsAndHashCode
@Getter
public final class NombreEmpresa {
    private final String nombreEmpresa;

    public NombreEmpresa(String nombreEmpresa) {
        if(nombreEmpresa == null || nombreEmpresa.isEmpty())
            throw new ExcepcionCampoNulo("nombre");
        if(nombreEmpresa.length() < 1 || nombreEmpresa.length() > 128)
            throw new ExcepcionValorInvalido("nombre", "El nombre debe tener entre 1 y 128 caracteres");

        this.nombreEmpresa = nombreEmpresa;
    }
}
