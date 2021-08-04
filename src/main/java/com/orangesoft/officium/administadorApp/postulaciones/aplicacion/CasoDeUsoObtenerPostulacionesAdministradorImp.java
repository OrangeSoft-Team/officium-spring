package com.orangesoft.officium.administadorApp.postulaciones.aplicacion;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida.PuertoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CasoDeUsoObtenerPostulacionesAdministradorImp implements CasoDeUsoObtenerPostulacionesAdministrador {

    private final PuertoObtenerPostulacionesAdministrador puertoObtenerPostulacionesAdministrador;

    @Override
    public List<PostulacionOfertaLaboralAdministrador> obtenerPostulaciones() {
        return puertoObtenerPostulacionesAdministrador.obtenerPostulaciones();
    }
}
