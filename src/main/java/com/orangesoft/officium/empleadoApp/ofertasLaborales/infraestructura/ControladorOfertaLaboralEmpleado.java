package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.comun.persistencia.empleado.PersistenciaEmpleado;
import com.orangesoft.officium.comun.seguridad.autenticacion.servicio.ServicioAutenticacion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.repositorios.RepositorioEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoAplicarOfertaLaboralEmpleadoEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoConsultarPostulacionesOfertasLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioAplicarOfertaLaboralEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioConsultarPostulacionesOfertasLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerDetalleOfertaLaboralEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerListaOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.seguridad.mapeador.MapeadorPersistenciaSeguridadEmpleado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @Autowired
    private final ServicioAutenticacion<Empleado, MapeadorPersistenciaSeguridadEmpleado, PersistenciaEmpleado, RepositorioEmpleado> servicioAutenticacionEmpleado;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoOfertasLaboralesActivasEmpleado> obtenerListaOfertasLaboralesActivasEmpleado(@RequestHeader Map<String, String> headers) {
        this.servicioAutenticacionEmpleado.validarUsuario(headers.get("authorization"));
        return servicioObtenerListaOfertasLaboralesActivasEmpleado.obtenerListaOfertasLaboralesActivasEmpleado();
    }

    @GetMapping("/{idOfertaLaboral}")
    @ResponseStatus(HttpStatus.OK)
    public DtoDetalleOfertaLaboralActivaEmpleado obtenerDetallesOfertaLaboralEmpleado(@PathVariable String idOfertaLaboral, @RequestHeader Map<String, String> headers) {
        this.servicioAutenticacionEmpleado.validarUsuario(headers.get("authorization"));
        return servicioObtenerDetalleOfertaLaboralEmpleado.consultarDetallesOfertaLaboral(idOfertaLaboral);
    }

    @PostMapping("/{idOfertaLaboral}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> postularseOfertaLaboral(@PathVariable String idOfertaLaboral, @RequestBody DtoAplicarOfertaLaboralEmpleadoEmpleado dtoAplicarOfertaLaboralEmpleado, @RequestHeader Map<String, String> headers) {
        this.servicioAutenticacionEmpleado.validarUsuario(headers.get("authorization"));
        servicioAplicarOfertaLaboralEmpleado.aplicarOfertaLaboral(dtoAplicarOfertaLaboralEmpleado, idOfertaLaboral);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/postulaciones/{idEmpleado}")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoConsultarPostulacionesOfertasLaboralesEmpleado> consultarPostulacionesOfertasLaboralesEmpleados(@PathVariable String idEmpleado, @RequestHeader Map<String, String> headers) {
        this.servicioAutenticacionEmpleado.validarUsuario(headers.get("authorization"));
        return servicioConsultarPostulacionesOfertasLaboralesEmpleado.consultarPostulacionesOfertasLaboralesEmpleado(idEmpleado);
    }
}
