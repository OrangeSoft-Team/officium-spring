package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerListaOfertasLaboralesActivasEmpleado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empleado/ofertas_laborales")
@AllArgsConstructor
public class ControladorOfertaLaboral {
    @Autowired
    private final ServicioObtenerListaOfertasLaboralesActivasEmpleado servicioObtenerListaOfertasLaboralesActivasEmpleado;

    @GetMapping("/")
    public List<DtoOfertasLaboralesActivasEmpleado> obtenerListaOfertasLaboralesActivasEmpleado() {
        return servicioObtenerListaOfertasLaboralesActivasEmpleado.obtenerListaOfertasLaboralesActivasEmpleado();
    }
}
