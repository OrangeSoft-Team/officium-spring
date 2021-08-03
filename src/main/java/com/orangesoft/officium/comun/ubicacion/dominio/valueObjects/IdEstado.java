package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdEstadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdEstado {
    private final UUID uuid;

    public IdEstado(UUID idEstado) {
        if(idEstado == null)
            throw new ExcepcionIdEstadoNulo();
        this.uuid = idEstado;
    }
}
