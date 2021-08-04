package com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;

public interface PuertoRechazarPostulacionAdministrador {
    public void rechazarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral);
}
