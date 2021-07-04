package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionIdCiudadNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class IdCiudad {
    private final String idCiudad;

    public IdCiudad(String idCiudad){
        if(idCiudad==null || idCiudad.isEmpty())
            throw new ExcepcionIdCiudadNulo();
        this.idCiudad=idCiudad;

    }
}
