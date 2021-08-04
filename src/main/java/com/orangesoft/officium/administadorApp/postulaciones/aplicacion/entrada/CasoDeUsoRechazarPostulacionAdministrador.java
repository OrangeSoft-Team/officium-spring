package com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;

public interface CasoDeUsoRechazarPostulacionAdministrador {
    public void rechazarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral);
}
