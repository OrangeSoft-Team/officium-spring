package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorQDtoDetalleOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetalleOfertaLaboralAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class PuertoObtenerDetallesOfertaLaboralAdministradorImp implements PuertoObtenerDetallesOfertaLaboralAdministrador {

    @Autowired
    private final RepositorioDetalleOfertaLaboralAdministrador repositorioDetalleOfertaLaboral;

    @Autowired
    private final MapeadorQDtoDetalleOfertaLaboralAdministrador mapeadorQDtoDetalleOfertaLaboral;

    @Override
    public OfertaLaboral obtenerDetalles(IdOfertaLaboral idOfertaLaboral) {
        return mapeadorQDtoDetalleOfertaLaboral.PersistenciaAOfertaLaboral(
                repositorioDetalleOfertaLaboral.obtenerDetallesOfertaLaboral(UUID.fromString(idOfertaLaboral.getIdOfertaLaboral()))
        );
    }
}
