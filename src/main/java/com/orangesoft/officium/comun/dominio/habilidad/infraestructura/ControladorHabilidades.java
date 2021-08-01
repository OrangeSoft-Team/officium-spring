package com.orangesoft.officium.comun.dominio.habilidad.infraestructura;

import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.servicios.ServicioObtenerListaHabilidades;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/habilidades")
@AllArgsConstructor
public class ControladorHabilidades {
    @Autowired
    private final ServicioObtenerListaHabilidades servicioObtenerListaHabilidades;

    @GetMapping("/")
    public List<DtoHabilidad> obtenerListaHabilidades() {
        return servicioObtenerListaHabilidades.ObtenerListaHabilidades();
    }
}
