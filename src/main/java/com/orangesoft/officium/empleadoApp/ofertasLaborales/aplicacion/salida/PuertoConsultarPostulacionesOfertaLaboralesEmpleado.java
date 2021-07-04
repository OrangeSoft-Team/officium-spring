package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.comun.generics.TripletaEmpresaOfertaPostulacion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;


import java.util.List;

public interface PuertoConsultarPostulacionesOfertaLaboralesEmpleado {
    public List<TripletaEmpresaOfertaPostulacion> consultarPostulacionesOfertaLaboralEmpleado(IdEmpleado idEmpleado);
}
