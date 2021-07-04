package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoVerOfertasLaboralesActivas;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesActivas;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class CasoUsoVerOfertasLaboralesActivasImpl implements CasoUsoVerOfertasLaboralesActivas  {
   @Autowired
    private final PuertoVerOfertasLaboralesActivas puertoVerOfertasLaboralesActivas;

    @Override
    public List<OfertaLaboral> ofertasLaboralesActivas() {
        return puertoVerOfertasLaboralesActivas.ofertasLaboralesActivas();
    }
}
