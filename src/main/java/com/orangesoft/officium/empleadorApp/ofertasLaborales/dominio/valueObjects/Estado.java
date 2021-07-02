package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionEstadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class Estado {
    private final String estado;

    public Estado(String estado){
        if(estado==null || estado.isEmpty())
            throw new ExcepcionEstadoNulo();
        this.estado=estado;
    }
}
