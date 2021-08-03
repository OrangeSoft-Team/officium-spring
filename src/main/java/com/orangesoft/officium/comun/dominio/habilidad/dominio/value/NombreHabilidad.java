package com.orangesoft.officium.comun.dominio.habilidad.dominio.value;

import com.orangesoft.officium.comun.dominio.habilidad.dominio.excepciones.ExcepcionNombreHabilidadInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NombreHabilidad {
    private final String nombre;

    public NombreHabilidad(String nombre) {
        if(nombre == null || nombre.isEmpty())
            throw new ExcepcionNombreHabilidadInvalido();
        this.nombre = nombre;
    }
}
