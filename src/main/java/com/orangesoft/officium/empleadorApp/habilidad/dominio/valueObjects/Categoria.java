package com.orangesoft.officium.empleadorApp.habilidad.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.habilidad.dominio.Excepciones.ExcepcionCategoriaHabilidadInvalida;
import com.orangesoft.officium.empleadorApp.habilidad.dominio.Excepciones.ExcepcionCategoriaHabilidadNoNull;

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
