package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida.PuertoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers.MapeadorQDtoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.repositorios.RepositorioDetallePostulacionOfertaLaboralAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PuertoDetallePostulacionOfertaLaboralAdministradorImp implements PuertoDetallePostulacionOfertaLaboralAdministrador {

    @Autowired
    private final RepositorioDetallePostulacionOfertaLaboralAdministrador repositorioDetallePostulacionOfertaLaboralAdministrador;

    @Autowired
    private final MapeadorQDtoDetallePostulacionOfertaLaboralAdministrador mapeadorQDtoDetallePostulacionOfertaLaboralAdministrador;

    @Override
    public PostulacionOfertaLaboralAdministrador obtenerDetallePostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral) {
        return mapeadorQDtoDetallePostulacionOfertaLaboralAdministrador.mapQDtoAPostulacion(
                repositorioDetallePostulacionOfertaLaboralAdministrador.obtenerDetallePostulacion(idPostulacionOfertaLaboral.getUuid())
        );
    }
}
