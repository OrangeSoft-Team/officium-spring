package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioVerOfertasLaboralesActivas;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/empleador/ofertas_laborales/:uuid_empresa")
@AllArgsConstructor
public class ControladorOfertasLaboralesActivas {
    @Autowired
    private ServicioVerOfertasLaboralesActivas servicioVerOfertasLaboralesActivas;

    public List<DtoOfertasLaboralesActivasEmpresa> ofertasLaboralesActivas(){
        return servicioVerOfertasLaboralesActivas.ofertasLaboralesActivas();
    }
}
