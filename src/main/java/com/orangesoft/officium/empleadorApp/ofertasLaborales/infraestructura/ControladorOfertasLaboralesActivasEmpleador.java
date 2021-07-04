package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioConsultarDetalleOfertasLaborales;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios.ServicioVerOfertasLaboralesActivas;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.GenericGenerators;
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

public class ControladorOfertasLaboralesActivasEmpleador {
    @Autowired
    private ServicioVerOfertasLaboralesActivas servicioVerOfertasLaboralesActivas;

    @Autowired
    private ServicioConsultarDetalleOfertasLaborales servicioConsultarDetalleOfertasLaborales;

    @GetMapping("/")
    public List<DtoOfertasLaboralesActivasEmpresa> ofertasLaboralesActivas(){
        return servicioVerOfertasLaboralesActivas.ofertasLaboralesActivas();
    }

    @GetMapping("/{idOfertaLaboral}")
    public DtoDetalleOfertaLaboralEmpresa consultarDetallesOfertaLaboral(@PathVariable String idOfertaLaboral) {
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e){
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        return servicioConsultarDetalleOfertasLaborales.consultarDetallesOfertaLaboral(idOfertaLaboral);
    }
}
