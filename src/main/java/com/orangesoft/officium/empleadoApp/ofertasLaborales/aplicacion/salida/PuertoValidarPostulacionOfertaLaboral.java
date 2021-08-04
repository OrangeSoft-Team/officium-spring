package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;

public interface PuertoValidarPostulacionOfertaLaboral {
    public Tupla<OfertaLaboral, Empleado> validarPostulacionOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral);
    public PostulacionOfertaLaboral validarSiYaSePostuloElEmpleado(IdEmpleado idEmpleado, IdOfertaLaboral idOfertaLaboral);
}
