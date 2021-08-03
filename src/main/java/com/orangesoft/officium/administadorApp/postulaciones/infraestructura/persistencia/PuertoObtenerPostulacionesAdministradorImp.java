package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.salida.PuertoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers.MapeadorQDtoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.query.QDtoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.repositorios.RepositorioObtenerPostulacionesAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class PuertoObtenerPostulacionesAdministradorImp implements PuertoObtenerPostulacionesAdministrador {

    @Autowired
    private final RepositorioObtenerPostulacionesAdministrador repositorioObtenerPostulacionesAdministrador;

    @Autowired
    private final MapeadorQDtoObtenerPostulacionesAdministrador mapeadorQDtoObtenerPostulacionesAdministrador;

    @Override
    public List<PostulacionOfertaLaboralAdministrador> obtenerPostulaciones() {
        List<PostulacionOfertaLaboralAdministrador> postulacionOfertaLaboralAdministradorList = new ArrayList<>();
        repositorioObtenerPostulacionesAdministrador.obtenerPostulaciones().forEach(queryPostulacion -> {
            postulacionOfertaLaboralAdministradorList.add(mapeadorQDtoObtenerPostulacionesAdministrador.mapQDtoAPostulacion(queryPostulacion));
        });
        return postulacionOfertaLaboralAdministradorList;
    }
}
