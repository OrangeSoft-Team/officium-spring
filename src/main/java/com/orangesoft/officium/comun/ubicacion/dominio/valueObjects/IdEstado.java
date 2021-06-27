package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdEstadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class IdEstado {
    private final String idEstado;

    public IdEstado(String idEstado) {
        if(idEstado == null || idEstado.isEmpty())
            throw new ExcepcionIdEstadoNulo();
        this.idEstado = idEstado;
    }
}
