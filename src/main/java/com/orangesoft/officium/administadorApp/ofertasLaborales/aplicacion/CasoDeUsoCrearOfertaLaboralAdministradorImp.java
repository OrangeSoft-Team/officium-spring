package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoCrearOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoCrearOfertaLaboralAdministrador;

@Component
@AllArgsConstructor
public class CasoDeUsoCrearOfertaLaboralAdministradorImp implements CasoDeUsoCrearOfertaLaboralAdministrador {

    @Autowired
    private final PuertoCrearOfertaLaboralAdministrador puertoCrearOfertaLaboralAdministrador;

    @Override
    public OfertaLaboral crearOfertaLaboral(OfertaLaboral ofertaLaboral) {
        puertoCrearOfertaLaboralAdministrador.crearOfertaLaboral(ofertaLaboral);
        return ofertaLaboral;
    }
}
