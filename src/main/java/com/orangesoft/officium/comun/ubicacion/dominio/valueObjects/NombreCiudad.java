package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombreCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionTamanoNombreCiudadInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@EqualsAndHashCode
@Getter
public final class NombreCiudad {
    private final String nombreCiudad;

    public NombreCiudad(String nombreCiudad) {
        if(nombreCiudad == null || nombreCiudad.isEmpty())
            throw new ExcepcionNombreCiudadNulo();
        if(nombreCiudad.length() < 2 || nombreCiudad.length() > 128)
            throw new ExcepcionTamanoNombreCiudadInvalido();
        this.nombreCiudad = nombreCiudad;
    }

}
