package com.orangesoft.officium.empleadorApp.direccion.valueObjects;

import com.orangesoft.officium.empleadorApp.direccion.excepciones.ExcepcionIdDireccionNoNull;

public class IdDireccion {
    private final String idDireccion;

    public IdDireccion(String idDireccion){
        if(idDireccion.isEmpty() || idDireccion== null)
            throw new ExcepcionIdDireccionNoNull();
        this.idDireccion=idDireccion;
    }
}
