package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoAceptarPostulacionAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioAceptarPostulacionOfertaLaboralAdministrador {

    @Autowired
    private final CasoDeUsoAceptarPostulacionAdministrador casoDeUsoAceptarPostulacionAdministrador;

    public void aceptarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral){
        casoDeUsoAceptarPostulacionAdministrador.aceptarPostulacion(idPostulacionOfertaLaboral);
    }
}
