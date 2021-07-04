package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoVerOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class CasoUsoVerOfertasLaboralesActivasEmpleadorImpl implements CasoUsoVerOfertasLaboralesActivasEmpleador {
   @Autowired
    private final PuertoVerOfertasLaboralesActivasEmpleador puertoVerOfertasLaboralesActivas;

    @Override
    public List<OfertaLaboral> ofertasLaboralesActivas(IdEmpresa idEmpresa) {
        return puertoVerOfertasLaboralesActivas.ofertasLaboralesActivas(idEmpresa);
    }
}
