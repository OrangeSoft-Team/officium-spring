package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;

@Component
@AllArgsConstructor
public class CasoDeUsoObtenerDetallesOfertaLaboralAdministradorImp implements CasoDeUsoObtenerDetallesOfertaLaboralAdministrador {

    @Autowired
    protected final PuertoObtenerDetallesOfertaLaboralAdministrador puertoObtenerDetallesOfertaLaboralAdministrador;

    @Override
    public OfertaLaboral obtenerDetalleOfertaLaboral(IdOfertaLaboral idOfertaLaboral) {
        OfertaLaboral ofertaLaboral = puertoObtenerDetallesOfertaLaboralAdministrador.obtenerDetalles(idOfertaLaboral);
        if (ofertaLaboral == null) {
            throw new RuntimeException("Oferta laboral no encontrada");
        }
        return ofertaLaboral;
    }
}
