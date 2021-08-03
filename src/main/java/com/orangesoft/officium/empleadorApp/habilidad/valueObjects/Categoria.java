package com.orangesoft.officium.empleadorApp.habilidad.valueObjects;

import com.orangesoft.officium.empleadorApp.habilidad.Excepciones.ExcepcionCategoriaHabilidadInvalida;
import com.orangesoft.officium.empleadorApp.habilidad.Excepciones.ExcepcionCategoriaHabilidadNoNull;

public class Categoria {
    private final String categoria;

    public Categoria(String categoria){
        if(categoria==null || categoria.isEmpty())
            throw new ExcepcionCategoriaHabilidadNoNull();
        if(categoria.length()<4 ||categoria.length()>64)
            throw new ExcepcionCategoriaHabilidadInvalida();
        this.categoria=categoria;
    }
}
