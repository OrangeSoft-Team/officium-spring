package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida.PuertoAceptarPostulacionAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.repositorios.RepositorioDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.comun.dominio.postulacionOfertaLaboral.EnumEstatusPostulacionOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.postulacionOfertaLaboral.PersistenciaPostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PuertoAceptarPostulacionAdministradorImp implements PuertoAceptarPostulacionAdministrador {

    @Autowired
    private final RepositorioDetallePostulacionOfertaLaboralAdministrador repositorioDetallePostulacionOfertaLaboralAdministrador;

    @Override
    public void aceptarPostulacion(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral) {
        PersistenciaPostulacionOfertaLaboral postulacion = repositorioDetallePostulacionOfertaLaboralAdministrador.getById(idPostulacionOfertaLaboral.getUuid());
        postulacion.setEstatus(EnumEstatusPostulacionOfertaLaboral.APROBADA.toString());
        repositorioDetallePostulacionOfertaLaboralAdministrador.save(postulacion);
    }
}
