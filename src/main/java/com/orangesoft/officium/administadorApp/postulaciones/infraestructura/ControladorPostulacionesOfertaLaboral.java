package com.orangesoft.officium.administadorApp.postulaciones.infraestructura;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoPostulacionesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioPostulacionesOfertaLaboralAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/staff/postulaciones")
@AllArgsConstructor
public class ControladorPostulacionesOfertaLaboral {

    @Autowired
    private final ServicioPostulacionesOfertaLaboralAdministrador servicioPostulacionesOfertaLaboralAdministrador;

    @Autowired
    private final ServicioDetallePostulacionOfertaLaboralAdministrador servicioDetallePostulacionOfertaLaboralAdministrador;

    @GetMapping("")
    public List<DtoPostulacionesOfertaLaboralAdministrador> obtenerPostulaciones() {
        return servicioPostulacionesOfertaLaboralAdministrador.obtenerPostulaciones();
    }

    @GetMapping("/{idPostulacion}")
    public DtoDetallePostulacionOfertaLaboralAdministrador obtenerDetallesOfertaLaboralAdministrador(@PathVariable String idPostulacion) {
        try{
            UUID.fromString(idPostulacion);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo enviado de la postulacion no es valido");
        }
        return servicioDetallePostulacionOfertaLaboralAdministrador.obtenerDetalles(new IdPostulacionOfertaLaboral(UUID.fromString(idPostulacion)));
    }
}
