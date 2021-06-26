package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombrePaisNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class IdPais {
    private final String idPais;

    public IdPais(String idPais) {
        if(idPais == null || idPais.isBlank())
            throw new ExcepcionNombrePaisNulo();
        this.idPais = idPais;
    }
}
