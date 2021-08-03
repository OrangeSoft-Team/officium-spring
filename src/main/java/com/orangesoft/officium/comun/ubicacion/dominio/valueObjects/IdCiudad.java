package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdCiudad {
    private final UUID uuid;

    public IdCiudad(UUID idCiudad) {
        if(idCiudad == null)
            throw new ExcepcionIdCiudadNulo();
        this.uuid = idCiudad;
    }
}
