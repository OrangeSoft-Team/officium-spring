package com.orangesoft.officium.comun.ubicacion.infraestructura;

import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoEstado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.servicios.ServicioObtenerListaCiudades;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacion")
@AllArgsConstructor
public class ControladorCiudades {
    @Autowired
    private final ServicioObtenerListaCiudades servicioObtenerListaCiudades;

    @GetMapping("/paises/{idPais}/estados/{idEstado}/ciudades")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoCiudad> obtenerEstados(@PathVariable String idPais, @PathVariable String idEstado) {
        return servicioObtenerListaCiudades.obtenerListaCiudades(idPais, idEstado);
    }
}
