package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionLongitudDescripcionOfertaLaboral;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class DescripcionOfertaLaboral {
    private final String descripcion;

    public DescripcionOfertaLaboral(String descripcion) {
        validarDescripcionOfertaLaboral(descripcion);
        this.descripcion = descripcion;
    }

    private void validarDescripcionOfertaLaboral(String descripcion) {
        if(descripcion.length() < 32 || descripcion.length() > 512)
            throw new ExcepcionLongitudDescripcionOfertaLaboral();
    }
}
