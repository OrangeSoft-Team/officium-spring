package com.orangesoft.officium.empleadoApp.trabajo.infraestructura;

import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ComandosTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ConsultasTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.DetalleTrabajoEmpleadoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/empleado/trabajos")
@AllArgsConstructor
public class ControladorTrabajos {
    @Autowired
    ComandosTrabajo comandosTrabajo;
    @Autowired
    ConsultasTrabajo consultasTrabajo;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<TrabajosEmpleadoDTO> obtenerTrabajosEmpleado() {
        // ObtenerIdEmpleado
        return consultasTrabajo.obtenerTrabajosEmpleado(UUID.randomUUID());
    }

    @GetMapping("/{idTrabajo}")
    @ResponseStatus(HttpStatus.OK)
    public DetalleTrabajoEmpleadoDTO obtenerDetalleTrabajoEmpleado(@PathVariable String idTrabajo) {
        return consultasTrabajo.obtenerDetalleTrabajo(UUID.fromString(idTrabajo));
    }
}
