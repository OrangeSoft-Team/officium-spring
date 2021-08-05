package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoObtenerListaOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoListaOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoPublicaEventoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
@AllArgsConstructor
public class CasoUsoObtenerListaOfertasLaboralesActivasEmpleadoImpl implements CasoUsoObtenerListaOfertasLaboralesActivasEmpleado {

    @Autowired
    public PuertoListaOfertasLaboralesActivas puertoListaOfertasLaboralesActivas;

    @Autowired
    public PuertoPublicaEventoOfertaLaboral puertoPublicaEventoOfertaLaboral;

    @Override
    public List<Tupla<NombreEmpresa, OfertaLaboral>> consultarListaOfertasLaboralesActivasEmpleado() {
        List<Tupla<NombreEmpresa, OfertaLaboral>> respuesta = puertoListaOfertasLaboralesActivas.obtenerListaOfertasLaboralesActivas();
        puertoPublicaEventoOfertaLaboral.publicarEvento("Se han consultado las ofertas",
                Instant.now(),
                "Completado exitosamente");
        return respuesta;
    }
}
