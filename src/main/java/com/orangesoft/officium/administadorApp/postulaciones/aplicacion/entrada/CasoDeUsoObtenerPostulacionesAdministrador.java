package com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;

import java.util.List;

public interface CasoDeUsoObtenerPostulacionesAdministrador {
    public List<PostulacionOfertaLaboralAdministrador> obtenerPostulaciones();
}
