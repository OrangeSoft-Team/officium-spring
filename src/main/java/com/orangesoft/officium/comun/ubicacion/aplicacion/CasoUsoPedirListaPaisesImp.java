package com.orangesoft.officium.comun.ubicacion.aplicacion;

import com.orangesoft.officium.comun.ubicacion.aplicacion.entrada.CasoUsoPedirListaPaises;
import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaPaises;
import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.NombrePais;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class CasoUsoPedirListaPaisesImp implements CasoUsoPedirListaPaises {
    protected final PuertoListaPaises puertoListaPaises;

    @Override
    public List<Pais> obtenerListaPaises() {
        return puertoListaPaises.obtenerListaPaises();
    }
}
