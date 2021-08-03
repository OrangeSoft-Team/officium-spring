package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class CalleDosDireccion {
    private String calle;

    public CalleDosDireccion(String calle) {
        this.calle = calle;
    }
}
