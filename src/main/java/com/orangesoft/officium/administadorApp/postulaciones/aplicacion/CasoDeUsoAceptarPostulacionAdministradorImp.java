package com.orangesoft.officium.administadorApp.postulaciones.aplicacion;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoAceptarPostulacionAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida.PuertoAceptarPostulacionAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CasoDeUsoAceptarPostulacionAdministradorImp implements CasoDeUsoAceptarPostulacionAdministrador {

    @Autowired
    private final PuertoAceptarPostulacionAdministrador puertoAceptarPostulacionAdministrador;

    @Override
    public void aceptarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral) {
        puertoAceptarPostulacionAdministrador.aceptarPostulacion(idPostulacionOfertaLaboral);
    }
}
