package com.orangesoft.officium.comun.ubicacion.infraestructura;

import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.servicios.ServicioObtenerListaPaises;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacion")
@AllArgsConstructor
public class ControladorPaises {
    private final ServicioObtenerListaPaises servicioObtenerListaPaises;

    @GetMapping("/")
    public List<DtoPais> obtenerPaises() {
        return servicioObtenerListaPaises.obtenerListaPaises();
    }
}
