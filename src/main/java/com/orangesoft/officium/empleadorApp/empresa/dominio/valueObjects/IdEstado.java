package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionIdEstadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class IdEstado {
    private final String idEstado;

    public IdEstado(String idEstado){
        if(idEstado==null || idEstado.isEmpty())
            throw new ExcepcionIdEstadoNulo();
        this.idEstado=idEstado;

    }
}
