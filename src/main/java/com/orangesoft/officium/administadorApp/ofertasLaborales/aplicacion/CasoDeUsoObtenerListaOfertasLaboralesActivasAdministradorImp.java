package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerListaOfertasLaboralesActivasAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoObtenerListaOfertasLaboralesActivasAdministrador;

@Component
@AllArgsConstructor
public class CasoDeUsoObtenerListaOfertasLaboralesActivasAdministradorImp implements CasoDeUsoObtenerListaOfertasLaboralesActivasAdministrador {

    @Autowired
    protected final PuertoObtenerListaOfertasLaboralesActivasAdministrador puertoObtenerListaOfertasLaboralesActivasAdministrador;

    @Override
    public List<OfertaLaboral> obtenerListaOfertasLaboralesActivas() {
        return puertoObtenerListaOfertasLaboralesActivasAdministrador.obtenerListOfertasLaborales();
    }
}
