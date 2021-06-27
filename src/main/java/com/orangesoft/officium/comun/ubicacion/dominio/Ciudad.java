package com.orangesoft.officium.comun.ubicacion.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdPaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombreCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.NombreCiudad;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Ciudad {
    private IdPais idPais;
    private IdEstado idEstado;
    private IdCiudad idCiudad;
    private NombreCiudad nombreCiudad;

    public Ciudad(IdPais idPais, IdEstado idEstado, IdCiudad idCiudad, NombreCiudad nombreCiudad) {
        if(idPais == null)
            throw new ExcepcionIdPaisNulo();
        if(idEstado == null)
            throw new ExcepcionIdEstadoNulo();
        if(idCiudad == null)
            throw new ExcepcionIdCiudadNulo();
        if(nombreCiudad == null)
            throw new ExcepcionNombreCiudadNulo();

        this.idPais = idPais;
        this.idEstado = idEstado;
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
    }
}
