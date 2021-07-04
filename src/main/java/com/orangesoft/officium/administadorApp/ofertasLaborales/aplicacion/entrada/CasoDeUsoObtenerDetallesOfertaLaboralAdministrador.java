package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;

public interface CasoDeUsoObtenerDetallesOfertaLaboralAdministrador {
    public OfertaLaboral obtenerDetalleOfertaLaboral(IdOfertaLaboral idOfertaLaboral);
}
