package com.orangesoft.officium.comun.ubicacion.aplicacion;

import com.orangesoft.officium.comun.ubicacion.aplicacion.entrada.CasoUsoObtenerListaPaises;
import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaPaises;
import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CasoUsoObtenerListaPaisesImp implements CasoUsoObtenerListaPaises {
    protected final PuertoListaPaises puertoListaPaises;

    @Override
    public List<Pais> obtenerListaPaises() {
        return puertoListaPaises.obtenerListaPaises();
    }
}
