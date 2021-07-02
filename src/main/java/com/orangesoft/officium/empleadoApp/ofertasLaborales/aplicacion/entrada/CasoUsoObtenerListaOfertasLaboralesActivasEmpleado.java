package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;

import java.util.List;

public interface CasoUsoObtenerListaOfertasLaboralesActivasEmpleado {
    public List<Tupla<NombreEmpresa, OfertaLaboral>> obtenerListaOfertasLaboralesActivasEmpleado();
}
