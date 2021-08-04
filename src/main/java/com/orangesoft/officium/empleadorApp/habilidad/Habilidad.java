package com.orangesoft.officium.empleadorApp.habilidad;

import com.orangesoft.officium.empleadorApp.habilidad.dominio.valueObjects.Categoria;
import com.orangesoft.officium.empleadorApp.habilidad.dominio.valueObjects.IdHabilidad;
import com.orangesoft.officium.empleadorApp.habilidad.dominio.valueObjects.NombreHabilidad;

public class Habilidad {
    private IdHabilidad idHabilidad;
    private NombreHabilidad nombreHabilidad;
    private Categoria categoria;

    public Habilidad(IdHabilidad idHabilidad,
             NombreHabilidad nombreHabilidad,
             Categoria categoria ) {
        this.idHabilidad=idHabilidad;
        this.nombreHabilidad=nombreHabilidad;
        this.categoria=categoria;
    }
}
