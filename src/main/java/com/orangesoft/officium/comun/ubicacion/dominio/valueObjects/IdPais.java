package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombrePaisNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdPais {
    private final UUID uuid;

    public IdPais(UUID idPais) {
        if(idPais == null)
            throw new ExcepcionNombrePaisNulo();
        this.uuid = idPais;
    }
}
