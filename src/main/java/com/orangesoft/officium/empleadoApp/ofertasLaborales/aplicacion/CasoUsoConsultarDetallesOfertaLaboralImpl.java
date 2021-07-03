package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEncontrada;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CasoUsoConsultarDetallesOfertaLaboralImpl implements CasoUsoConsultarDetallesOfertaLaboral {
    @Autowired
    private final PuertoDetallesOfertaLaboral puertoDetallesOfertaLaboral;

    @Override
    public Tupla<Empresa, OfertaLaboral> consultarDetallesOfertaLaboral(IdOfertaLaboral idOfertaLaboral) {
        Tupla<Empresa,OfertaLaboral> tupla = puertoDetallesOfertaLaboral.obtenerDetallesOfertaLaboral(idOfertaLaboral);
        if(tupla != null)
            return tupla;
        throw new ExcepcionOfertaLaboralNoEncontrada();
    }
}
