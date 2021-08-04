package com.orangesoft.officium.administadorApp.postulaciones.aplicacion;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoRechazarPostulacionAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida.PuertoRechazarPostulacionAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CasoDeUsoRechazarPostulacionAdministradorImp implements CasoDeUsoRechazarPostulacionAdministrador {

    @Autowired
    private final PuertoRechazarPostulacionAdministrador puertoRechazarPostulacionAdministrador;

    @Override
    public void rechazarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral) {
        puertoRechazarPostulacionAdministrador.rechazarPostulacion(idPostulacionOfertaLaboral);
    }
}
