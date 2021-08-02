package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoDuplicarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoCrearOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class CasoDeUsoDuplicarOfertaLaboralAdministradorImp implements CasoDeUsoDuplicarOfertaLaboralAdministrador {

    @Autowired
    public final PuertoObtenerDetallesOfertaLaboralAdministrador puertoObtenerDetallesOfertaLaboralAdministrador;

    @Autowired
    public final PuertoCrearOfertaLaboralAdministrador puertoCrearOfertaLaboralAdministrador;

    @Override
    public void duplicarOfertaLaboral(IdOfertaLaboral idOfertaLaboral) {
        OfertaLaboral ofertaLaboral = this.puertoObtenerDetallesOfertaLaboralAdministrador.obtenerDetalles(idOfertaLaboral);
        ofertaLaboral.setIdOfertaLaboral(new IdOfertaLaboral(UUID.randomUUID()));
        this.puertoCrearOfertaLaboralAdministrador.crearOfertaLaboral(ofertaLaboral);
    }
}
