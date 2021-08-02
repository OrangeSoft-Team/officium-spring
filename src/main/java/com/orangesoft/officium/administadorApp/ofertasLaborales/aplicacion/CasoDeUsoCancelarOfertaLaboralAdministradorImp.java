package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoCancelarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoCancelarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CasoDeUsoCancelarOfertaLaboralAdministradorImp implements CasoDeUsoCancelarOfertaLaboralAdministrador {

    @Autowired
    private final PuertoCancelarOfertaLaboralAdministrador puertoCancelarOfertaLaboral;

    @Override
    public void cancelarOfertaLaboral(IdOfertaLaboral idOfertaLaboral){
        this.puertoCancelarOfertaLaboral.cancelarOfertaLaboral(idOfertaLaboral);
    }

}
