package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios.ServicioObtenerListaOfertasLaboralesActivasAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasAdministrador;

@RestController
@RequestMapping("/api/personal_administrativo/ofertas_laborales")
@AllArgsConstructor
public class ControladorOfertasLaborales {
    @Autowired
    private ServicioObtenerListaOfertasLaboralesActivasAdministrador servicioObtenerListaOfertasLaboralesActivasAdministrador;

    @GetMapping()
    public List<DtoOfertasLaboralesActivasAdministrador> obtenerListaOfertasLaboralesActivasEmpleado() {
        return servicioObtenerListaOfertasLaboralesActivasAdministrador.obtenerListaOfertasLaboralesActivasAdministrador();
    }

}
