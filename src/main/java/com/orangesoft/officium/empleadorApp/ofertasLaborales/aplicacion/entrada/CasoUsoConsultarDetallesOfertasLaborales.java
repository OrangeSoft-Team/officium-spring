package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;

import java.util.List;

public interface CasoUsoConsultarDetallesOfertasLaborales {
    public Tupla<Empresa, OfertaLaboral> consultarDetallesOfertaLaboral(IdOfertaLaboral idOfertaLaboral);
}
