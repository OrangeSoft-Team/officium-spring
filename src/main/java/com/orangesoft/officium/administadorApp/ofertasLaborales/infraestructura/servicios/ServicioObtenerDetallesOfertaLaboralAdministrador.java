package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorHabilidadDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDtoDetalleOfertasLaboralActivaAdministrador;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicioObtenerDetallesOfertaLaboralAdministrador {
    @Autowired
    private final MapeadorDtoDetalleOfertasLaboralActivaAdministrador mapeadorDtoDetalleOfertasLaboralActivaAdministrador;

    @Autowired
    private final MapeadorHabilidadDTO mapeadorHabilidadDTO;

    @Autowired
    private final CasoDeUsoObtenerDetallesOfertaLaboralAdministrador casoDeUsoObtenerDetallesOfertaLaboralAdministrador;

    public DtoDetalleOfertaLaboralActivaAdministrador obtenerDetalleOfertaLaboralAdministrador(IdOfertaLaboral idOfertaLaboral) {
        OfertaLaboral ofertaLaboral = casoDeUsoObtenerDetallesOfertaLaboralAdministrador.obtenerDetalleOfertaLaboral(idOfertaLaboral);
        DtoDetalleOfertaLaboralActivaAdministrador dto = mapeadorDtoDetalleOfertasLaboralActivaAdministrador.mapOfertaLaboralADto(ofertaLaboral);
        List<DtoHabilidad> habilidadList = new ArrayList<>();
        ofertaLaboral.getHabilidades().forEach(habilidad -> {
            habilidadList.add(mapeadorHabilidadDTO.HabilidadADtoHabilidad(habilidad));
        });
        dto.setHabilidades(habilidadList);
        return dto;
    }
}
