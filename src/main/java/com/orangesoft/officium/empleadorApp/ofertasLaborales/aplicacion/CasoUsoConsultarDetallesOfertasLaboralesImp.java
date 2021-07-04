package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.empleadorApp.Tupla.Tupla;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.excepciones.ExcepcionOfertaLaboralNoEncontrada;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
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
    public Tupla<Empresa, OfertaLaboral> consultarDetallesOfertaLaboral(IdOfertaLaboral idOfertaLaboral) {
        Tupla<Empresa,OfertaLaboral> tupla = puertoConsultarDetallesOfertasLaborales
                .consultarDetallesOfertasLaborales(idOfertaLaboral);
        if(tupla != null)
            return tupla;
        throw new ExcepcionOfertaLaboralNoEncontrada();
    }
}
