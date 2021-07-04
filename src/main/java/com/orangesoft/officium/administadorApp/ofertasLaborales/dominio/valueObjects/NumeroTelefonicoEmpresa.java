package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;

@EqualsAndHashCode
@Getter
public final class NumeroTelefonicoEmpresa {
    private final int nombreEmpresa;

    public NumeroTelefonicoEmpresa(int numeroTelefonicoEmpresa) {
        if(numeroTelefonicoEmpresa == 0)
            throw new ExcepcionCampoNulo("número telefónico");

        this.nombreEmpresa = numeroTelefonicoEmpresa;
    }
}
