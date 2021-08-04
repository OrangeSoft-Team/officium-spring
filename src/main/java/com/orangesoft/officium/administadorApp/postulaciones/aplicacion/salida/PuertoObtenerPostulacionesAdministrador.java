package com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;

import java.util.List;

public interface PuertoObtenerPostulacionesAdministrador {
    public List<PostulacionOfertaLaboralAdministrador> obtenerPostulaciones();
}
