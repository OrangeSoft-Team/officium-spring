package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.CasoDeUsoCancelarOfertaLaboralAdministradorImp;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioCancelarOfertaLaboralAdministrador {

    @Autowired
    public final CasoDeUsoCancelarOfertaLaboralAdministradorImp casoDeUsoCancelarOfertaLaboralAdministrador;

    public void cancelarOfertaLaboral(IdOfertaLaboral idOfertaLaboral){
        casoDeUsoCancelarOfertaLaboralAdministrador.cancelarOfertaLaboral(idOfertaLaboral);
    }
}
