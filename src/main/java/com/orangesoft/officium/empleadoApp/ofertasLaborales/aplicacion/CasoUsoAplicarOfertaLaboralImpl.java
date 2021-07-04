package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoAplicarOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import org.springframework.stereotype.Component;

@Component
public class CasoUsoAplicarOfertaLaboralImpl implements CasoUsoAplicarOfertaLaboral {
    @Override
    public void aplicarOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral) {

    }
}
