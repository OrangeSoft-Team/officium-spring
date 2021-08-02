package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDtoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.IdHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorHabilidadDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicioModificarOfertaLaboralAdministrador {
    @Autowired
    private final CasoDeUsoModificarOfertaLaboralAdministrador casoDeUsoModificarOfertaLaboralAdministrador;

    @Autowired
    private final MapeadorDtoModificarOfertaLaboralAdministrador mapeadorDtoModificarOfertaLaboralAdministrador;

    public void modificarOfertaLaboral(IdOfertaLaboral idOfertaLaboral, DtoModificarOfertaLaboralAdministrador dtoModificarOfertaLaboralAdministrador){
        OfertaLaboral ofertaLaboral = mapeadorDtoModificarOfertaLaboralAdministrador.mapDtoAOfertaLaboral(dtoModificarOfertaLaboralAdministrador);
        ofertaLaboral.setHabilidades(mapeadorDtoModificarOfertaLaboralAdministrador.map(dtoModificarOfertaLaboralAdministrador.getHabilidades()));
        casoDeUsoModificarOfertaLaboralAdministrador.modificarOfertaLaboral(
                idOfertaLaboral,
                ofertaLaboral
                );
    }
}
