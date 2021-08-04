package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoVerOfertasLaboralesInactivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoVerOfertasLaboralesInactivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CasoUsoVerOfertasLaboralesInactivasImpEmpleador implements CasoUsoVerOfertasLaboralesInactivasEmpleador {
    @Autowired
    private final PuertoVerOfertasLaboralesInactivasEmpleador puertoVerOfertasLaboralesInactivas;
    @Override
    public List<OfertaLaboral> ofertasLaboralesInactivas(IdEmpresa idEmpresa) {
        return puertoVerOfertasLaboralesInactivas.ofertasLaboralesInactivas(idEmpresa);
    }
}
