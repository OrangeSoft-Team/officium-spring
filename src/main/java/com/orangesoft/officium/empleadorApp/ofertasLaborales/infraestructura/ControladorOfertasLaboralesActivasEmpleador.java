package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioVerOfertasLaboralesActivasEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/empleador/ofertas_laborales")
@AllArgsConstructor

public class ControladorOfertasLaboralesActivasEmpleador {
    @Autowired
    private final ServicioVerOfertasLaboralesActivasEmpleador servicioVerOfertasLaboralesActivas;
    
    @GetMapping("/{idEmpresa}")
    public List<DtoOfertasLaboralesActivasEmpleador> ofertasLaboralesActivas(@PathVariable String idEmpresa){
        return servicioVerOfertasLaboralesActivas.ofertasLaboralesActivas(idEmpresa);
    }
}
