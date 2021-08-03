package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura;


import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertaLaboralActivaEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioOfertaLaboralActivaEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/empleador/ofertas_laborales")
@AllArgsConstructor

public class ControladorOfertaLaboralEmpleador {
    @Autowired
    private ServicioOfertaLaboralActivaEmpleador servicioVerOfertasLaboralesActivasEmpleador;

    @GetMapping("/{idEmpresa}")
    public List<DtoOfertaLaboralActivaEmpleador> ofertasLaboralesActivas(@PathVariable String idEmpresa) {
        return servicioVerOfertasLaboralesActivasEmpleador.ofertasLaboralesActivas(idEmpresa);

    }


}
