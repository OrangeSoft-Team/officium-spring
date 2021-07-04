package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;

public interface CasoUsoAplicarOfertaLaboral {
    public void aplicarOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral);
}
