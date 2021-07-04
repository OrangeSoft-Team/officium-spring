package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombrePaisNulo;

@EqualsAndHashCode
@Getter
public final class IdEmpresa {
    private final String idEmpresa;

    public IdEmpresa(String idEmpresa) {
        if(idEmpresa == null || idEmpresa.isEmpty())
            throw new ExcepcionNombrePaisNulo();
        this.idEmpresa = idEmpresa;
    }
}
