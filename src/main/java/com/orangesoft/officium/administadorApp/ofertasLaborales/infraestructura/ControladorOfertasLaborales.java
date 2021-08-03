package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
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

    @GetMapping()
    public List<DtoOfertasLaboralesActivasAdministrador> obtenerListaOfertasLaboralesActivasEmpleado() {
        return servicioObtenerListaOfertasLaboralesActivasAdministrador.obtenerListaOfertasLaboralesActivasAdministrador();
    }

    @GetMapping("/{idOfertaLaboral}")
    public DtoDetalleOfertaLaboralActivaAdministrador obtenerDetallesOfertaLaboralAdministrador(@PathVariable String idOfertaLaboral) {
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo de oferta laboral enviado no es valido");
        }
        return servicioObtenerDetallesOfertaLaboralAdministrador.obtenerDetalleOfertaLaboralAdministrador(new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)));
    }

    @PostMapping()
    public DtoCrearOfertaLaboralEmpresaAdministrador crearOfertaLaboral(
            @RequestBody DtoCrearOfertaLaboralEmpresaAdministrador dtoCrearOfertaLaboralEmpresaAdministrador
    ){
        return servicioCrearOfertaLaboralEmpresaAdministrador.crearOfertaLaboralAdministrador(dtoCrearOfertaLaboralEmpresaAdministrador);
    }

    @PutMapping("/{idOfertaLaboral}/cancelar")
    public void cancelarOfertaLaboralAdministrador(@PathVariable String idOfertaLaboral) {
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo de oferta laboral enviado no es valido");
        }
        servicioCancelarOfertaLaboralAdministrador.cancelarOfertaLaboral(new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)));
    }

    @PostMapping("/{idOfertaLaboral}/duplicar")
    public void duplicarOfertaLaboralAdministrador(@PathVariable String idOfertaLaboral) {
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException("El codigo de oferta laboral enviado no es valido");
        }
        servicioDuplicarOfertaLaboralAdministrador.duplicarOfertaLaboral(new IdOfertaLaboral(UUID.fromString(idOfertaLaboral)));
    }

    @PutMapping("/{idOfertaLaboral}")
    public void modificarOfertaLaboralAdministrador(
            @PathVariable String idOfertaLaboral,
            @RequestBody DtoModificarOfertaLaboralAdministrador dtoModificarOfertaLaboralAdministrador
    ){
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
