package com.orangesoft.officium.comun.ubicacion.infraestructura;

import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoEstado;

import com.orangesoft.officium.comun.ubicacion.infraestructura.servicios.ServicioObtenerListaEstados;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacion")
@AllArgsConstructor
public class ControladorEstados {
    @Autowired
    private final ServicioObtenerListaEstados servicioObtenerListaEstados;

    @GetMapping("/paises/{idPais}/estados")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoEstado> obtenerEstados(@PathVariable String idPais) {
        return servicioObtenerListaEstados.obtenerListaEstados(idPais);
    }
}
