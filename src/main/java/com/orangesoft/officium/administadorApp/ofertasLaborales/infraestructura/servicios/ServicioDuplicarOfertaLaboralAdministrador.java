package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoDuplicarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioDuplicarOfertaLaboralAdministrador {
    @Autowired
    public final CasoDeUsoDuplicarOfertaLaboralAdministrador casoDeUsoDuplicarOfertaLaboralAdministrador;

    public void duplicarOfertaLaboral(IdOfertaLaboral idOfertaLaboral){
        casoDeUsoDuplicarOfertaLaboralAdministrador.duplicarOfertaLaboral(idOfertaLaboral);
    }
}
