package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionIdPaisNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class IdPais {
    private final String idPais;

    public IdPais(String idPais){
        if(idPais==null || idPais.isEmpty())
            throw new ExcepcionIdPaisNulo();
        this.idPais=idPais;

    }
}
