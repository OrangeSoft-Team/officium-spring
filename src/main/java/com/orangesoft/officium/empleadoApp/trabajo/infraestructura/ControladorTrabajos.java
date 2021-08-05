package com.orangesoft.officium.empleadoApp.trabajo.infraestructura;

import com.orangesoft.officium.comun.persistencia.empleado.PersistenciaEmpleado;
import com.orangesoft.officium.comun.seguridad.autenticacion.servicio.ServicioAutenticacion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.repositorios.RepositorioEmpleado;
import com.orangesoft.officium.empleadoApp.seguridad.mapeador.MapeadorPersistenciaSeguridadEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ComandosTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ConsultasTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.DetalleTrabajoEmpleadoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/empleado/trabajos")
@AllArgsConstructor
public class ControladorTrabajos {
    @Autowired
    ComandosTrabajo comandosTrabajo;
    @Autowired
    ConsultasTrabajo consultasTrabajo;
    @Autowired
    private final ServicioAutenticacion<Empleado, MapeadorPersistenciaSeguridadEmpleado, PersistenciaEmpleado, RepositorioEmpleado> servicioAutenticacionEmpleado;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<TrabajosEmpleadoDTO> obtenerTrabajosEmpleado(@RequestHeader Map<String, String> headers) {
        Empleado empleado = servicioAutenticacionEmpleado.validarUsuario(headers.get("authorization"));
        return consultasTrabajo.obtenerTrabajosEmpleado(empleado.getIdEmpleado().getIdEmpleado());
    }

    @GetMapping("/{idTrabajo}")
    @ResponseStatus(HttpStatus.OK)
    public DetalleTrabajoEmpleadoDTO obtenerDetalleTrabajoEmpleado(@PathVariable String idTrabajo, @RequestHeader Map<String, String> headers) {
        servicioAutenticacionEmpleado.validarUsuario(headers.get("authorization"));
        return consultasTrabajo.obtenerDetalleTrabajo(UUID.fromString(idTrabajo));
    }

    @PutMapping("/{idTrabajo}")
    @ResponseStatus(HttpStatus.OK)
    public void renunciarTrabajoEmpleado(@PathVariable String idTrabajo, @RequestHeader Map<String, String> headers) {
        Empleado empleado = servicioAutenticacionEmpleado.validarUsuario(headers.get("authorization"));
        comandosTrabajo.renunciarTrabajo(empleado.getIdEmpleado().getIdEmpleado(), UUID.fromString(idTrabajo));
    }
}
