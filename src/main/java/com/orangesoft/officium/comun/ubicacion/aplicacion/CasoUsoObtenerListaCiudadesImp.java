package com.orangesoft.officium.comun.ubicacion.aplicacion;

import com.orangesoft.officium.comun.ubicacion.aplicacion.entrada.CasoUsoObtenerListaCiudades;
import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaCiudades;
import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaPaises;
import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CasoUsoObtenerListaCiudadesImp implements CasoUsoObtenerListaCiudades {
    protected final PuertoListaCiudades puertoListaCiudades;

    @Override
    public List<Ciudad> obtenerListaCiudades(IdPais idPais, IdEstado idEstado) {
        return puertoListaCiudades.obtenerListaCiudades(idPais, idEstado);
    }
}
