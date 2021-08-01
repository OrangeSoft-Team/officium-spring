package com.orangesoft.officium.comun.dominio.habilidad.dominio.value;

import com.orangesoft.officium.comun.dominio.habilidad.dominio.excepciones.ExcepcionIdHabilidadNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdHabilidad {
    private final UUID uuid;

    public IdHabilidad(UUID uuid) {
        if(uuid == null)
            throw new ExcepcionIdHabilidadNulo();
        this.uuid = uuid;
    }
}
