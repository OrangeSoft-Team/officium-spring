package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionCalleUnoDireccionNula;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class CalleUnoDireccion {
    private String calle;

    public CalleUnoDireccion(String calle) {
        if(calle == null)
            throw new ExcepcionCalleUnoDireccionNula();
        this.calle = calle;
    }
}
