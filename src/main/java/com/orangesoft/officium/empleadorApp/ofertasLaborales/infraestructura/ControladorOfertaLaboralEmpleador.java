package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura;


import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoConsultarDetallesOfertasLaboralesEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertaLaboralActivaEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioOfertaLaboralActivaEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioOfertaLaboralInactivaEmpleador;
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

    @Autowired
    private ServicioConsultarDetallesOfertasLaborales servicioConsultarDetalleOfertasLaborales;

    @Autowired
    private ServicioOfertaLaboralInactivaEmpleador servicioVerOfertasLaboralesInactivasEmpleador;


    @GetMapping("/{idEmpresa}")
    public List<DtoOfertaLaboralActivaEmpleador> ofertasLaboralesActivas(@PathVariable String idEmpresa) {
        return servicioVerOfertasLaboralesActivasEmpleador.ofertasLaboralesActivas(idEmpresa);

    }

   /* @GetMapping("/{idEmpresa}")
    public List<DtoOfertaLaboralActivaEmpleador> ofertasLaboralesInactivas(@PathVariable String idEmpresa) {
        return servicioVerOfertasLaboralesInactivasEmpleador.ofertasLaboralesInactivas(idEmpresa);

    }8*/

    @GetMapping("/{idOfertaLaboral}")
    public DtoConsultarDetallesOfertasLaboralesEmpleador consultarDetallesOfertaLaboral(@PathVariable String idOfertaLaboral) {
        try {
            UUID.fromString(idOfertaLaboral);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        return servicioConsultarDetalleOfertasLaborales.consultarDetallesOfertaLaboral(idOfertaLaboral);
    }


}
