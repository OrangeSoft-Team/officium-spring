package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;

import java.util.List;

public interface PuertoVerOfertasLaboralesActivasEmpleador {
    public List<OfertaLaboral> ofertasLaboralesActivas(IdEmpresa idEmpresa);
}
