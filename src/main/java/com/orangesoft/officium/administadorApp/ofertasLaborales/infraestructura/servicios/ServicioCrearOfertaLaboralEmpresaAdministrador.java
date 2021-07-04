package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoCrearOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpresaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDtoCrearOfertaLaboralEmpresaAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioCrearOfertaLaboralEmpresaAdministrador {
    @Autowired
    private final MapeadorDtoCrearOfertaLaboralEmpresaAdministrador mapeadorDtoCrearOfertaLaboralEmpresaAdministrador;

    @Autowired
    private final CasoDeUsoCrearOfertaLaboralAdministrador casoDeUsoCrearOfertaLaboralAdministrador;

    public DtoCrearOfertaLaboralEmpresaAdministrador crearOfertaLaboralAdministrador (DtoCrearOfertaLaboralEmpresaAdministrador dtoCrearOfertaLaboralEmpresaAdministrador) {
        return mapeadorDtoCrearOfertaLaboralEmpresaAdministrador.mapOfertaLaboralADto(
                casoDeUsoCrearOfertaLaboralAdministrador.crearOfertaLaboral(
                    mapeadorDtoCrearOfertaLaboralEmpresaAdministrador.mapDtoAOfertaLaboral(
                            dtoCrearOfertaLaboralEmpresaAdministrador
                    )
                )
        );

    }
}
