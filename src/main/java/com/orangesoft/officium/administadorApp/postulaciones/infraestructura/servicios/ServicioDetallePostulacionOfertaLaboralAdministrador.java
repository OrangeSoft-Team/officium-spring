package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.postulaciones.aplicacion.entrada.CasoDeUsoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers.MapeadorDtoDetallePostulacionOfertaLaboralAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioDetallePostulacionOfertaLaboralAdministrador {

    @Autowired
    private final CasoDeUsoDetallePostulacionOfertaLaboralAdministrador casoDeUsoDetallePostulacionOfertaLaboralAdministrador;

    @Autowired
    private final MapeadorDtoDetallePostulacionOfertaLaboralAdministrador mapeadorDtoDetallePostulacionOfertaLaboralAdministrador;

    public DtoDetallePostulacionOfertaLaboralAdministrador obtenerDetalles(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral){
        return mapeadorDtoDetallePostulacionOfertaLaboralAdministrador.mapDtoAPostulacion(
                casoDeUsoDetallePostulacionOfertaLaboralAdministrador.obtenerDetallePostulacion(idPostulacionOfertaLaboral)
        );
    }
}
