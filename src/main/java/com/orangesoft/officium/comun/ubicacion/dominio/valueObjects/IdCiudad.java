package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class IdCiudad {
    private final String idCiudad;

    public IdCiudad(String idCiudad) {
        if(idCiudad == null || idCiudad.isEmpty())
            throw new ExcepcionIdCiudadNulo();
        this.idCiudad = idCiudad;
    }
}
