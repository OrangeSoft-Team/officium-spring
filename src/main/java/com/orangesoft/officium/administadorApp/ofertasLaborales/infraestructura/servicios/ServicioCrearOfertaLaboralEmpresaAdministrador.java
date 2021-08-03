package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoCrearOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpresaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDtoCrearOfertaLaboralEmpresaAdministrador;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorHabilidadDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicioCrearOfertaLaboralEmpresaAdministrador {
    @Autowired
    private final MapeadorDtoCrearOfertaLaboralEmpresaAdministrador mapeadorDtoCrearOfertaLaboralEmpresaAdministrador;

    @Autowired
    private final CasoDeUsoCrearOfertaLaboralAdministrador casoDeUsoCrearOfertaLaboralAdministrador;

    @Autowired
    private final MapeadorHabilidadDTO mapeadorHabilidadDTO;

    public DtoCrearOfertaLaboralEmpresaAdministrador crearOfertaLaboralAdministrador (DtoCrearOfertaLaboralEmpresaAdministrador dtoCrearOfertaLaboralEmpresaAdministrador) {
        OfertaLaboral ofertaLaboral = mapeadorDtoCrearOfertaLaboralEmpresaAdministrador.mapDtoAOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador);
        List<Habilidad> habilidades = new ArrayList<>();
        dtoCrearOfertaLaboralEmpresaAdministrador.getHabilidades().forEach(habilidad -> {
            habilidades.add(mapeadorHabilidadDTO.DtoHabilidadAHabilidad(habilidad));
        });
        ofertaLaboral.setHabilidades(habilidades);
        DtoCrearOfertaLaboralEmpresaAdministrador dto = mapeadorDtoCrearOfertaLaboralEmpresaAdministrador.mapOfertaLaboralADto(
                casoDeUsoCrearOfertaLaboralAdministrador.crearOfertaLaboral(
                        ofertaLaboral
                )
        );
        dto.setHabilidades(dtoCrearOfertaLaboralEmpresaAdministrador.getHabilidades());
        return dto;

    }
}
