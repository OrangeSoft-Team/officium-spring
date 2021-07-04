package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.comun.generics.Tripleta;
import com.orangesoft.officium.comun.generics.TripletaEmpresaOfertaPostulacion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarPostulacionesOfertasLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoConsultarPostulacionesOfertaLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CasoUsoConsultarPostulacionesOfertasLaboralesEmpleadoImpl implements CasoUsoConsultarPostulacionesOfertasLaboralesEmpleado {
    @Autowired
    private PuertoConsultarPostulacionesOfertaLaboralesEmpleado puertoConsultarPostulacionesOfertaLaboralEmpleado;

    @Override
    public List<TripletaEmpresaOfertaPostulacion> obtenerPostulacionesOfertaLaboral(IdEmpleado idEmpleado) {
        return puertoConsultarPostulacionesOfertaLaboralEmpleado.consultarPostulacionesOfertaLaboralEmpleado(idEmpleado);
    }
}
