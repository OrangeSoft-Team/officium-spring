package com.orangesoft.officium.administadorApp.postulaciones.infraestructura;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoPostulacionesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioAceptarPostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioPostulacionesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioRechazarPostulacionOfertaLaboralAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private final ServicioAceptarPostulacionOfertaLaboralAdministrador servicioAceptarPostulacionOfertaLaboralAdministrador;

    @Autowired
    private final ServicioRechazarPostulacionOfertaLaboralAdministrador servicioRechazarPostulacionOfertaLaboralAdministrador;

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

    @PutMapping("/{idPostulacion}/aceptar")
    public void aceptarPostulacionOfertaLaboral(@PathVariable String idPostulacion) {
        try{
            UUID.fromString(idPostulacion);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo enviado de la postulacion no es valido");
        }
        servicioAceptarPostulacionOfertaLaboralAdministrador.aceptarPostulacion(new IdPostulacionOfertaLaboral(UUID.fromString(idPostulacion)));
    }

    @PutMapping("/{idPostulacion}/rechazar")
    public void rechazarPostulacionOfertaLaboral(@PathVariable String idPostulacion) {
        try{
            UUID.fromString(idPostulacion);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo enviado de la postulacion no es valido");
        }
        servicioRechazarPostulacionOfertaLaboralAdministrador.rechazarPostulacion(new IdPostulacionOfertaLaboral(UUID.fromString(idPostulacion)));
    }
}
