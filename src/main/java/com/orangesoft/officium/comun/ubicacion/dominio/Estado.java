package com.orangesoft.officium.comun.ubicacion.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombreEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.NombreEstado;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class Estado {
    private IdEstado idEstado;
    private NombreEstado nombreEstado;

    public Estado(IdEstado idEstado, NombreEstado nombreEstado) {
        if(idEstado == null)
            throw new ExcepcionIdEstadoNulo();
        if(nombreEstado == null)
            throw new ExcepcionNombreEstadoNulo();

        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
    }
}
