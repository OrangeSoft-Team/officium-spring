package com.orangesoft.officium.administadorApp.postulaciones.infraestructura;

import com.orangesoft.officium.administadorApp.administrador.dominio.PersonalAdministrativo;
import com.orangesoft.officium.administadorApp.administrador.infraestructura.mappers.MapeadorPersistenciaPersonalAdministrativo;
import com.orangesoft.officium.administadorApp.administrador.infraestructura.persistencia.repositorios.RepositorioObtenerAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoPostulacionesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioAceptarPostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioDetallePostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioPostulacionesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.servicios.ServicioRechazarPostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.comun.persistencia.personalAdministrativo.PersistenciaPersonalAdministrativo;
import com.orangesoft.officium.comun.seguridad.autenticacion.servicio.ServicioAutenticacion;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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

    @Autowired
    private final ServicioAutenticacion<PersonalAdministrativo, MapeadorPersistenciaPersonalAdministrativo, PersistenciaPersonalAdministrativo, RepositorioObtenerAdministrador> servicioAutenticacion;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoPostulacionesOfertaLaboralAdministrador> obtenerPostulaciones(@RequestHeader Map<String, String> headers) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        return servicioPostulacionesOfertaLaboralAdministrador.obtenerPostulaciones();
    }

    @GetMapping("/{idPostulacion}")
    @ResponseStatus(HttpStatus.OK)
    public DtoDetallePostulacionOfertaLaboralAdministrador obtenerDetallesOfertaLaboralAdministrador(
            @PathVariable String idPostulacion,
            @RequestHeader Map<String, String> headers
    ) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        try{
            UUID.fromString(idPostulacion);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo enviado de la postulacion no es valido");
        }
        return servicioDetallePostulacionOfertaLaboralAdministrador.obtenerDetalles(new IdPostulacionOfertaLaboral(UUID.fromString(idPostulacion)));
    }

    @PutMapping("/{idPostulacion}/aceptar")
    @ResponseStatus(HttpStatus.OK)
    public void aceptarPostulacionOfertaLaboral(@PathVariable String idPostulacion, @RequestHeader Map<String, String> headers) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        try{
            UUID.fromString(idPostulacion);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo enviado de la postulacion no es valido");
        }
        servicioAceptarPostulacionOfertaLaboralAdministrador.aceptarPostulacion(new IdPostulacionOfertaLaboral(UUID.fromString(idPostulacion)));
    }

    @PutMapping("/{idPostulacion}/rechazar")
    @ResponseStatus(HttpStatus.OK)
    public void rechazarPostulacionOfertaLaboral(@PathVariable String idPostulacion, @RequestHeader Map<String, String> headers) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        try{
            UUID.fromString(idPostulacion);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo enviado de la postulacion no es valido");
        }
        servicioRechazarPostulacionOfertaLaboralAdministrador.rechazarPostulacion(new IdPostulacionOfertaLaboral(UUID.fromString(idPostulacion)));
    }
}
