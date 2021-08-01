package com.orangesoft.officium.comun.dominio.habilidad.dominio.value;

import com.orangesoft.officium.comun.dominio.habilidad.dominio.excepciones.ExcepcionCategoriaHabilidadInvalida;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class CategoriaHabilidad {
    private final String categoria;

    public CategoriaHabilidad(String categoria) {
        if(categoria == null)
            throw new ExcepcionCategoriaHabilidadInvalida();
        this.categoria = categoria;
    }
}
