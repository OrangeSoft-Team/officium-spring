package com.orangesoft.officium.comun.ubicacion.aplicacion.salida;

import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;

import java.util.List;

public interface PuertoListaEstados {
    public List<Estado> obtenerListaPaises(IdPais idPais);
}
