package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;

import java.util.List;
import java.util.Map;

public interface CasoUsoObtenerListaOfertasLaboralesActivasEmpleado {
    public Map<NombreEmpresa, OfertaLaboral> obtenerListaOfertasLaboralesActivasEmpleado();
}
