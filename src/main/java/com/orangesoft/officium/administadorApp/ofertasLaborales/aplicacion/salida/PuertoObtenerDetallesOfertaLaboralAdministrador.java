package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;

public interface PuertoObtenerDetallesOfertaLaboralAdministrador {
    public OfertaLaboral obtenerDetalles(IdOfertaLaboral idOfertaLaboral);
}
