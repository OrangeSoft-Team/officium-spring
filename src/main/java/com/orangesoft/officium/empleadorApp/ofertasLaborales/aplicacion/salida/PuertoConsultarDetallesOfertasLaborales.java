package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;

import java.util.List;

public interface PuertoConsultarDetallesOfertasLaborales {
    public Tupla<Empresa,OfertaLaboral> consultarDetallesOfertasLaborales(IdOfertaLaboral idOfertaLaboral);

}
