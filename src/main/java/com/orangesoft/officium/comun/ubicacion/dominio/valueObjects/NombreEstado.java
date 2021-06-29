package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombreEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionlongitudNombreEstadoInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NombreEstado {
    private final String nombreEstado;

    public NombreEstado(String nombreEstado) {
        if(nombreEstado == null || nombreEstado.isEmpty())
            throw new ExcepcionNombreEstadoNulo();
        if(nombreEstado.length() < 2 || nombreEstado.length() > 128)
            throw new ExcepcionlongitudNombreEstadoInvalido();

        this.nombreEstado = nombreEstado;
    }
}
