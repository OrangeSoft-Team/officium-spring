package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTituloOfertaLaboralNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionTamanoNombreEstadoInvalido;

@EqualsAndHashCode
@Getter
public final class TituloOfertaLaboral {
    private final String tituloOfertaLaboral;

    public TituloOfertaLaboral(String tituloOfertaLaboral) {
        if(tituloOfertaLaboral == null || tituloOfertaLaboral.isEmpty())
            throw new ExcepcionTituloOfertaLaboralNulo();
        if(tituloOfertaLaboral.length() < 2 || tituloOfertaLaboral.length() > 128)
            throw new ExcepcionTamanoNombreEstadoInvalido();

        this.tituloOfertaLaboral = tituloOfertaLaboral;
    }
}
