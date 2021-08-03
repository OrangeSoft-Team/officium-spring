package com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombrePaisNulo;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdEmpresa {
    private final UUID idEmpresa;

    public IdEmpresa(UUID idEmpresa) {
        if(idEmpresa == null)
            throw new ExcepcionNombrePaisNulo();
        this.idEmpresa = idEmpresa;
    }
}
