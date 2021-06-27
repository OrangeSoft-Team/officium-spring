package com.orangesoft.officium.comun.ubicacion.infraestructura;

import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoEstado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.servicios.ServicioObtenerListaCiudades;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacion")
@AllArgsConstructor
public class ControladorCiudades {
    @Autowired
    private final ServicioObtenerListaCiudades servicioObtenerListaCiudades;

    @GetMapping("/paises/{idPais}/estados/{idEstado}/ciudades")
    public List<DtoCiudad> obtenerEstados(@PathVariable String idPais, @PathVariable String idEstado) {
        return servicioObtenerListaCiudades.obtenerListaCiudades(idPais, idEstado);
    }
}
