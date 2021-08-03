package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdDireccionNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public class IdDireccion {
    private final UUID uuid;

    public IdDireccion(UUID uuid) {
        if(uuid == null)
            throw new ExcepcionIdDireccionNulo();
        this.uuid = uuid;
    }
}
