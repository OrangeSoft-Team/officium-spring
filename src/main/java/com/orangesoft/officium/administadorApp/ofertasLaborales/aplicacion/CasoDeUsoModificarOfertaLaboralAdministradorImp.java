package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CasoDeUsoModificarOfertaLaboralAdministradorImp implements CasoDeUsoModificarOfertaLaboralAdministrador {

    private final PuertoObtenerDetallesOfertaLaboralAdministrador puertoObtenerDetallesOfertaLaboralAdministrador;

    @Autowired
    private final PuertoModificarOfertaLaboralAdministrador puertoModificarOfertaLaboralAdministrador;

    @Override
    public void modificarOfertaLaboral(IdOfertaLaboral idOfertaLaboral, OfertaLaboral ofertaLaboral) {
        OfertaLaboral ofertaLaboralBaseDeDatos = puertoObtenerDetallesOfertaLaboralAdministrador.obtenerDetalles(idOfertaLaboral);
        if (ofertaLaboral == null) {
            throw new RuntimeException("Oferta laboral no encontrada");
        }
        ofertaLaboral.setIdOfertaLaboral(ofertaLaboralBaseDeDatos.getIdOfertaLaboral());
        ofertaLaboral.setFechaPublicacionOfertaLaboral(ofertaLaboralBaseDeDatos.getFechaPublicacionOfertaLaboral());
        ofertaLaboral.setIdEmpresaOfertaLaboral(ofertaLaboralBaseDeDatos.getIdEmpresaOfertaLaboral());
        puertoModificarOfertaLaboralAdministrador.modifcarOfertaLaboral(idOfertaLaboral, ofertaLaboral);
    }
}
