package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;

public interface CasoUsoConsultarDetallesOfertaLaboral {
    public Tupla<Empresa, OfertaLaboral> consultarDetallesOfertaLaboral(IdOfertaLaboral idOfertaLaboral);
}
