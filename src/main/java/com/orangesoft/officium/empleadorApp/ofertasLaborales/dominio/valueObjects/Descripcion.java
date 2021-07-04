package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionDescripcionNulo;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTamanoDescripcionInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class Descripcion {
    private final String descripcion;
         public Descripcion(String descripcion){
             if(descripcion == null || descripcion.isEmpty())
                 throw new ExcepcionDescripcionNulo();
             if (descripcion.length()<32 || descripcion.length()>512)
                 throw new ExcepcionTamanoDescripcionInvalido();
             this.descripcion=descripcion;
        }

}
