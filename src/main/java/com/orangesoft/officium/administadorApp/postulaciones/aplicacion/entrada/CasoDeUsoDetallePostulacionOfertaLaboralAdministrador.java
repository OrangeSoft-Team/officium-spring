package com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;

public interface CasoDeUsoDetallePostulacionOfertaLaboralAdministrador {
    public PostulacionOfertaLaboralAdministrador obtenerDetallePostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral);
}
