package com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionValorInvalido;

@EqualsAndHashCode
@Getter
public final class DireccionEmpresa {
    private final String direccionEmpresa;

    public DireccionEmpresa(String direccionEmpresa) {
        if(direccionEmpresa == null || direccionEmpresa.isEmpty())
            throw new ExcepcionCampoNulo("direccion");
        if(direccionEmpresa.length() < 5 || direccionEmpresa.length() > 256)
            throw new ExcepcionValorInvalido("direccion", "El direccion debe tener entre 5 y 256 caracteres");

        this.direccionEmpresa = direccionEmpresa;
    }
}
