package com.orangesoft.officium.comun.ubicacion.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombreCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.NombreCiudad;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class Ciudad {
    private IdCiudad idCiudad;
    private NombreCiudad nombreCiudad;

    public Ciudad(IdCiudad idCiudad, NombreCiudad nombreCiudad) {
        if(idCiudad == null)
            throw new ExcepcionIdCiudadNulo();
        if(nombreCiudad == null)
            throw new ExcepcionNombreCiudadNulo();

        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
    }
}
