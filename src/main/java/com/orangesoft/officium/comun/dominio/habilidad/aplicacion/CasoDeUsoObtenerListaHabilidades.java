package com.orangesoft.officium.comun.dominio.habilidad.aplicacion;

import com.orangesoft.officium.comun.dominio.habilidad.aplicacion.salida.PuertoObtenerListaHabilidades;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class CasoDeUsoObtenerListaHabilidades {
    @Autowired
    private final PuertoObtenerListaHabilidades puertoObtenerListaHabilidades;

    public List<Habilidad> ObtenerListaHabilidades() {
        return puertoObtenerListaHabilidades.obtenerListaHabilidades();
    }
}
