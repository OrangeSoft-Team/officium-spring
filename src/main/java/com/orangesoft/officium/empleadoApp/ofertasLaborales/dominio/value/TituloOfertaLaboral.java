package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionLongitudTituloOfertaLaboralInvalida;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionTituloOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class TituloOfertaLaboral {
    private final String titulo;

    public TituloOfertaLaboral(String titulo) {
        validarTituloOfertaLaboral(titulo);
        this.titulo = titulo;
    }

    private void validarTituloOfertaLaboral(String titulo) {
        if(titulo == null)
            throw new ExcepcionTituloOfertaLaboralNulo();
        if(titulo.length() < 4 || titulo.length() > 80)
            throw new ExcepcionLongitudTituloOfertaLaboralInvalida();
    }
}
