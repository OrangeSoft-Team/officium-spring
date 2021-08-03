package com.orangesoft.officium.empleadorApp.habilidad.valueObjects;

import com.orangesoft.officium.empleadorApp.habilidad.Excepciones.ExcepcionNombreHabilidadInvalido;
import com.orangesoft.officium.empleadorApp.habilidad.Excepciones.ExcepcionNombreHabilidadNoNull;

public class NombreHabilidad {
    private final String nombreHabilidad;

    public NombreHabilidad(String nombreHabilidad){
        if(nombreHabilidad==null || nombreHabilidad.isEmpty())
            throw new ExcepcionNombreHabilidadNoNull();
        if(nombreHabilidad.length()<4 || nombreHabilidad.length()>64)
            throw new ExcepcionNombreHabilidadInvalido();
        this.nombreHabilidad=nombreHabilidad;

    }
}
