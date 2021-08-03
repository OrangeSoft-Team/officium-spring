package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionEstadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class Estado {
    private final EnumEstadoOfertaLaboral estado;

    public Estado(EnumEstadoOfertaLaboral estado){
        this.estado=estado;
        this.validarEstado(estado);
    }

    public void validarEstado(EnumEstadoOfertaLaboral estado){
        if(estado == null)
            throw new ExcepcionEstadoNulo();
    }

}
