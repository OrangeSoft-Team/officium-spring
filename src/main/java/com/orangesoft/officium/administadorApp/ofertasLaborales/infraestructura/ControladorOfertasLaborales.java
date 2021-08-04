package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.administadorApp.administrador.dominio.PersonalAdministrativo;
import com.orangesoft.officium.administadorApp.administrador.infraestructura.mappers.MapeadorPersistenciaPersonalAdministrativo;
import com.orangesoft.officium.administadorApp.administrador.infraestructura.persistencia.repositorios.RepositorioObtenerAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios.*;
import com.orangesoft.officium.comun.persistencia.personalAdministrativo.PersistenciaPersonalAdministrativo;
import com.orangesoft.officium.comun.seguridad.autenticacion.servicio.ServicioAutenticacion;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpresaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasAdministrador;

@RestController
@RequestMapping("/api/staff/ofertas_laborales")
@AllArgsConstructor
public class ControladorOfertasLaborales {
    @Autowired
    private final ServicioObtenerListaOfertasLaboralesActivasAdministrador servicioObtenerListaOfertasLaboralesActivasAdministrador;

    @Autowired
    private final ServicioObtenerDetallesOfertaLaboralAdministrador servicioObtenerDetallesOfertaLaboralAdministrador;

    @Autowired
    private final ServicioCrearOfertaLaboralEmpresaAdministrador servicioCrearOfertaLaboralEmpresaAdministrador;

    @Autowired
    private final ServicioCancelarOfertaLaboralAdministrador servicioCancelarOfertaLaboralAdministrador;

    @Autowired
    private final ServicioDuplicarOfertaLaboralAdministrador servicioDuplicarOfertaLaboralAdministrador;

    @Autowired
    private final ServicioModificarOfertaLaboralAdministrador servicioModificarOfertaLaboralAdministrador;

    @Autowired
    private final ServicioAutenticacion<PersonalAdministrativo, MapeadorPersistenciaPersonalAdministrativo, PersistenciaPersonalAdministrativo, RepositorioObtenerAdministrador> servicioAutenticacion;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<DtoOfertasLaboralesActivasAdministrador> obtenerListaOfertasLaboralesActivasEmpleado(@RequestHeader Map<String, String> headers) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        return servicioObtenerListaOfertasLaboralesActivasAdministrador.obtenerListaOfertasLaboralesActivasAdministrador();
    }

    @GetMapping("/{idOfertaLaboral}")
    @ResponseStatus(HttpStatus.OK)
    public DtoDetalleOfertaLaboralActivaAdministrador obtenerDetallesOfertaLaboralAdministrador(
            @PathVariable String idOfertaLaboral,
            @RequestHeader Map<String, String> headers
    ) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo de oferta laboral enviado no es valido");
        }
        return servicioObtenerDetallesOfertaLaboralAdministrador.obtenerDetalleOfertaLaboralAdministrador(new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)));
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public DtoCrearOfertaLaboralEmpresaAdministrador crearOfertaLaboral(
            @RequestBody DtoCrearOfertaLaboralEmpresaAdministrador dtoCrearOfertaLaboralEmpresaAdministrador,
            @RequestHeader Map<String, String> headers
    ){
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        return servicioCrearOfertaLaboralEmpresaAdministrador.crearOfertaLaboralAdministrador(dtoCrearOfertaLaboralEmpresaAdministrador);
    }

    @PutMapping("/{idOfertaLaboral}/cancelar")
    @ResponseStatus(HttpStatus.OK)
    public void cancelarOfertaLaboralAdministrador(
            @PathVariable String idOfertaLaboral,
            @RequestHeader Map<String, String> headers
    ) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo de oferta laboral enviado no es valido");
        }
        servicioCancelarOfertaLaboralAdministrador.cancelarOfertaLaboral(new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)));
    }

    @PostMapping("/{idOfertaLaboral}/duplicar")
    @ResponseStatus(HttpStatus.OK)
    public void duplicarOfertaLaboralAdministrador(
            @PathVariable String idOfertaLaboral,
            @RequestHeader Map<String, String> headers
    ) {
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo de oferta laboral enviado no es valido");
        }
        servicioDuplicarOfertaLaboralAdministrador.duplicarOfertaLaboral(new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)));
    }

    @PutMapping("/{idOfertaLaboral}")
    @ResponseStatus(HttpStatus.OK)
    public void modificarOfertaLaboralAdministrador(
            @PathVariable String idOfertaLaboral,
            @RequestBody DtoModificarOfertaLaboralAdministrador dtoModificarOfertaLaboralAdministrador,
            @RequestHeader Map<String, String> headers
    ){
        this.servicioAutenticacion.validarUsuario(headers.get("authorization"));
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo de oferta laboral enviado no es valido");
        }
        servicioModificarOfertaLaboralAdministrador.modificarOfertaLaboral(
                new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)),
                dtoModificarOfertaLaboralAdministrador
        );
    }

}
