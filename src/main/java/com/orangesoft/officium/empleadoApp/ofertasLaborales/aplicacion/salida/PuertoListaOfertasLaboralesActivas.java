package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;

import java.util.List;

public interface PuertoListaOfertasLaboralesActivas {
    public List<Tupla<NombreEmpresa, OfertaLaboral>> obtenerListaOfertasLaboralesActivas();
}
