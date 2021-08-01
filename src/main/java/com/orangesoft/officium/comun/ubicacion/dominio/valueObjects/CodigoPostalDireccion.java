package com.orangesoft.officium.comun.ubicacion.dominio.valueObjects;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionCodigoPostalDireccionNulo;

public class CodigoPostalDireccion {
    private String codigoPostal;

    public CodigoPostalDireccion(String codigoPostal) {
        if(codigoPostal == null || codigoPostal.isEmpty())
            throw new ExcepcionCodigoPostalDireccionNulo();
        this.codigoPostal = codigoPostal;
    }
}
