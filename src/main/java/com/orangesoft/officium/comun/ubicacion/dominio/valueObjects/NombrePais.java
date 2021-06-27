package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombrePaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionTamanoNombrePaisInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NombrePais {
    private final String nombrePais;

    public NombrePais(String nombrePais) {
        if(nombrePais == null || nombrePais.isEmpty())
            throw new ExcepcionNombrePaisNulo();
        if(nombrePais.length() < 2 || nombrePais.length() > 128)
            throw new ExcepcionTamanoNombrePaisInvalido();
        this.nombrePais = nombrePais;
    }
}
