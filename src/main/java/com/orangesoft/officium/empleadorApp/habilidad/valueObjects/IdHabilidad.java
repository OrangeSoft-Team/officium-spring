package com.orangesoft.officium.empleadorApp.habilidad.valueObjects;

import com.orangesoft.officium.empleadorApp.habilidad.Excepciones.ExcepcionIdHabilidadNoNull;

public class IdHabilidad {
    private final String idHabilidad;

    public IdHabilidad(String idHabilidad){
        if(idHabilidad==null || idHabilidad.isEmpty())
            throw new ExcepcionIdHabilidadNoNull();
        this.idHabilidad=idHabilidad;

    }
}
