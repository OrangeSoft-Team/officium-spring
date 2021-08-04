package com.orangesoft.officium.administadorApp.postulaciones.aplicacion;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida.PuertoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CasoDeUsoDetallePostulacionOfertaLaboralAdministradorImp implements CasoDeUsoDetallePostulacionOfertaLaboralAdministrador {

    @Autowired
    private final PuertoDetallePostulacionOfertaLaboralAdministrador puertoDetallePostulacionOfertaLaboralAdministrador;

    @Override
    public PostulacionOfertaLaboralAdministrador obtenerDetallePostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral) {
        return puertoDetallePostulacionOfertaLaboralAdministrador.obtenerDetallePostulacion(idPostulacionOfertaLaboral);
    }
}
