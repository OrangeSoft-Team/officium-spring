package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class VideoDePresentacionEmpleado {
    private final String urlVideoPresentacion;

    public VideoDePresentacionEmpleado(String urlVideoPresentacion) {
        this.urlVideoPresentacion = urlVideoPresentacion;
    }
}
