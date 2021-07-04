package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerDetalleOfertaLaboralEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerListaOfertasLaboralesActivasEmpleado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
