package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDtoDetalleOfertasLaboralActivaAdministrador;

@Service
@AllArgsConstructor
public class ServicioObtenerDetallesOfertaLaboralAdministrador {
    @Autowired
    private final MapeadorDtoDetalleOfertasLaboralActivaAdministrador mapeadorDtoDetalleOfertasLaboralActivaAdministrador;

    @Autowired
    private final CasoDeUsoObtenerDetallesOfertaLaboralAdministrador casoDeUsoObtenerDetallesOfertaLaboralAdministrador;

    public DtoDetalleOfertaLaboralActivaAdministrador obtenerDetalleOfertaLaboralAdministrador(IdOfertaLaboral idOfertaLaboral) {
        return mapeadorDtoDetalleOfertasLaboralActivaAdministrador.mapOfertaLaboralADto(
            casoDeUsoObtenerDetallesOfertaLaboralAdministrador.obtenerDetalleOfertaLaboral(idOfertaLaboral)
        );
    }
}
