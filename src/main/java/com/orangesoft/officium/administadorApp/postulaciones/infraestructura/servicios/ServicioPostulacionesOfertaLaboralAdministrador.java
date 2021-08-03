package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoPostulacionesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers.MapeadorDtoPostulacionesOfertaLaboralAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicioPostulacionesOfertaLaboralAdministrador {

    @Autowired
    private final CasoDeUsoObtenerPostulacionesAdministrador casoDeUsoObtenerPostulacionesAdministrador;

    @Autowired
    private final MapeadorDtoPostulacionesOfertaLaboralAdministrador mapeadorDtoPostulacionesOfertaLaboralAdministrador;

    public List<DtoPostulacionesOfertaLaboralAdministrador> obtenerPostulaciones(){
        List<DtoPostulacionesOfertaLaboralAdministrador> dtoList = new ArrayList<>();
        casoDeUsoObtenerPostulacionesAdministrador.obtenerPostulaciones().forEach(postulacionOfertaLaboralAdministrador -> {
           dtoList.add(
                   mapeadorDtoPostulacionesOfertaLaboralAdministrador.mapQDtoAPostulacion(postulacionOfertaLaboralAdministrador)
           );
        });
        return dtoList;
    }
}
