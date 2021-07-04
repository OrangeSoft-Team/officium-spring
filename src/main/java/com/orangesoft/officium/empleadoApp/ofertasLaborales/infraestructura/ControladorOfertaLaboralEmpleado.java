package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoAplicarOfertaLaboralEmpleadoEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioAplicarOfertaLaboralEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerDetalleOfertaLaboralEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerListaOfertasLaboralesActivasEmpleado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/empleado/ofertas_laborales")
@AllArgsConstructor
public class ControladorOfertaLaboralEmpleado {
    @Autowired
    private final ServicioObtenerListaOfertasLaboralesActivasEmpleado servicioObtenerListaOfertasLaboralesActivasEmpleado;

    @Autowired
    private final ServicioObtenerDetalleOfertaLaboralEmpleado servicioObtenerDetalleOfertaLaboralEmpleado;

    @Autowired
    private final ServicioAplicarOfertaLaboralEmpleado servicioAplicarOfertaLaboralEmpleado;

    // TODO: Definir query strings para aplicar filtros de busqueda y encapsular a través de un comando
    @GetMapping("/")
    public List<DtoOfertasLaboralesActivasEmpleado> obtenerListaOfertasLaboralesActivasEmpleado() {
        return servicioObtenerListaOfertasLaboralesActivasEmpleado.obtenerListaOfertasLaboralesActivasEmpleado();
    }

    // TODO: Mejorar el manejo de excepciones de aplicación
    @GetMapping("/{idOfertaLaboral}")
    public DtoDetalleOfertaLaboralActivaEmpleado obtenerDetallesOfertaLaboralEmpleado(@PathVariable String idOfertaLaboral) {
        try{
            UUID.fromString(idOfertaLaboral);
        }catch (IllegalArgumentException e){
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        return servicioObtenerDetalleOfertaLaboralEmpleado.consultarDetallesOfertaLaboral(idOfertaLaboral);
    }

    @PostMapping("/{idOfertaLaboral}")
    public ResponseEntity<Void> postularseOfertaLaboral(@PathVariable String idOfertaLaboral, @RequestBody DtoAplicarOfertaLaboralEmpleadoEmpleado dtoAplicarOfertaLaboralEmpleadoEmpleado) {
        try{
            UUID.fromString(idOfertaLaboral);
            UUID.fromString(dtoAplicarOfertaLaboralEmpleadoEmpleado.getUuidEmpleado());
            UUID.fromString(dtoAplicarOfertaLaboralEmpleadoEmpleado.getUuidEmpresa());
        }catch (IllegalArgumentException e){
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        servicioAplicarOfertaLaboralEmpleado.aplicarOfertaLaboral(dtoAplicarOfertaLaboralEmpleadoEmpleado.getUuidEmpleado().toString(), dtoAplicarOfertaLaboralEmpleadoEmpleado.getUuidEmpresa().toString(), idOfertaLaboral);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
