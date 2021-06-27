package com.orangesoft.officium.comun.ubicacion.aplicacion.salida;

import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;

import java.util.List;

public interface PuertoListaCiudades {
    public List<Ciudad> obtenerListaCiudades(IdPais idPais, IdEstado idEstado);
}
