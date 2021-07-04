package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada;

import com.orangesoft.officium.comun.generics.TripletaEmpresaOfertaPostulacion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;


import java.util.List;

public interface CasoUsoConsultarPostulacionesOfertasLaboralesEmpleado {
    public List<TripletaEmpresaOfertaPostulacion> obtenerPostulacionesOfertaLaboral(IdEmpleado idEmpleado);
}
