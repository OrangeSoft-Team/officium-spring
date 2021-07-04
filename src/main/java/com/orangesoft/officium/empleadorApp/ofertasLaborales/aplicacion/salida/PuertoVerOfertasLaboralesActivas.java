package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;

import java.util.List;

public interface PuertoVerOfertasLaboralesActivas {
    public List<OfertaLaboral> ofertasLaboralesActivas();
}
