package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTamanoTituloInvalido;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTituloNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class Titulo {
    private final String titulo;

    public Titulo(String titulo){
        if(titulo== null || titulo.isEmpty())
            throw new ExcepcionTituloNulo();
        if(titulo.length()<4 || titulo.length()>40)
            throw new ExcepcionTamanoTituloInvalido();
        this.titulo=titulo;
    }
}
