package com.orangesoft.officium.comun.dominio.habilidad.dominio;

import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.CategoriaHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.IdHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.NombreHabilidad;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class Habilidad {
    private IdHabilidad idHabilidad;
    private NombreHabilidad nombreHabilidad;
    private CategoriaHabilidad categoriaHabilidad;

    public Habilidad(IdHabilidad idHabilidad,
                     NombreHabilidad nombreHabilidad,
                     CategoriaHabilidad categoriaHabilidad) {
        this.idHabilidad = idHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.categoriaHabilidad = categoriaHabilidad;
    }
}
