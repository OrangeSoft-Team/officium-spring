package com.orangesoft.officium.comun.ubicacion.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdPaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombreEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombrePaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.NombreEstado;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Estado {
    private IdPais idPais;
    private IdEstado idEstado;
    private NombreEstado nombreEstado;

    public Estado(IdPais idPais, IdEstado idEstado, NombreEstado nombreEstado) {
        if(idPais == null)
            throw new ExcepcionIdPaisNulo();
        if(idEstado == null)
            throw new ExcepcionIdEstadoNulo();
        if(nombreEstado == null)
            throw new ExcepcionNombreEstadoNulo();

        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
    }
}
