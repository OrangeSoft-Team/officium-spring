package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;

public interface PuertoDetallesOfertaLaboral {
    public Tupla<Empresa, OfertaLaboral> obtenerDetallesOfertaLaboral(IdOfertaLaboral idOfertaLaboral);
}
