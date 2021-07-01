package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoObtenerListaOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CasoUsoObtenerListaOfertasLaboralesActivasEmpleadoImp implements CasoUsoObtenerListaOfertasLaboralesActivasEmpleado {

    @Override
    public Map<NombreEmpresa, OfertaLaboral> obtenerListaOfertasLaboralesActivasEmpleado() {
        return null;
    }
}
