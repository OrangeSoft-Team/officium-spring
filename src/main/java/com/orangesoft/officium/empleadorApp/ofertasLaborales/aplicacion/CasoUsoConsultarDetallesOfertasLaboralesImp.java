package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class CasoUsoConsultarDetallesOfertasLaboralesImp implements CasoUsoConsultarDetallesOfertasLaborales {
    @Autowired
    private final PuertoConsultarDetallesOfertasLaborales puertoConsultarDetallesOfertasLaborales;

    @Override
    public List<OfertaLaboral> consultarDetallesofertasLaborales() {
        return puertoConsultarDetallesOfertasLaborales.consultarDetallesOfertasLaborales();
    }
}
