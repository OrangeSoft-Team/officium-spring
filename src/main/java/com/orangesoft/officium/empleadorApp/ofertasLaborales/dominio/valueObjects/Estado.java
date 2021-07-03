package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionEstadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class Estado {
    private final char estado;

    public Estado(char estado){
        this.estado=estado;
    }
}
