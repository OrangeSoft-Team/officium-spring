package com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;

public interface CasoDeUsoAceptarPostulacionAdministrador {
    public void aceptarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral);
}
