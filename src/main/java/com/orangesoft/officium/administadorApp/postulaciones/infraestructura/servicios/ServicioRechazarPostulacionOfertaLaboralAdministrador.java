package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoRechazarPostulacionAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioRechazarPostulacionOfertaLaboralAdministrador {

    @Autowired
    private final CasoDeUsoRechazarPostulacionAdministrador casoDeUsoRechazarPostulacionAdministrador;

    public void rechazarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral){
        casoDeUsoRechazarPostulacionAdministrador.rechazarPostulacion(idPostulacionOfertaLaboral);
    }
}
