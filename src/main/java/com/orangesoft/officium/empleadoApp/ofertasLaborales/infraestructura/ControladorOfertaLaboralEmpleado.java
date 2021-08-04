package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoAplicarOfertaLaboralEmpleadoEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoConsultarPostulacionesOfertasLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioAplicarOfertaLaboralEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioConsultarPostulacionesOfertasLaboralesEmpleado;
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

    @Autowired
    private final ServicioConsultarPostulacionesOfertasLaboralesEmpleado servicioConsultarPostulacionesOfertasLaboralesEmpleado;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoOfertasLaboralesActivasEmpleado> obtenerListaOfertasLaboralesActivasEmpleado() {
        return servicioObtenerListaOfertasLaboralesActivasEmpleado.obtenerListaOfertasLaboralesActivasEmpleado();
    }

    @GetMapping("/{idOfertaLaboral}")
    @ResponseStatus(HttpStatus.OK)
    public DtoDetalleOfertaLaboralActivaEmpleado obtenerDetallesOfertaLaboralEmpleado(@PathVariable String idOfertaLaboral) {
        return servicioObtenerDetalleOfertaLaboralEmpleado.consultarDetallesOfertaLaboral(idOfertaLaboral);
    }

    @PostMapping("/{idOfertaLaboral}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> postularseOfertaLaboral(@PathVariable String idOfertaLaboral, @RequestBody DtoAplicarOfertaLaboralEmpleadoEmpleado dtoAplicarOfertaLaboralEmpleadoEmpleado) {
        servicioAplicarOfertaLaboralEmpleado.aplicarOfertaLaboral(dtoAplicarOfertaLaboralEmpleadoEmpleado, idOfertaLaboral);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/postulaciones/{idEmpleado}")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoConsultarPostulacionesOfertasLaboralesEmpleado> consultarPostulacionesOfertasLaboralesEmpleados(@PathVariable String idEmpleado) {
        return servicioConsultarPostulacionesOfertasLaboralesEmpleado.consultarPostulacionesOfertasLaboralesEmpleado(idEmpleado);
    }
}
