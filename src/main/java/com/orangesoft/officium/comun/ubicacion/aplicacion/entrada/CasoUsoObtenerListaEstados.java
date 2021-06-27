package com.orangesoft.officium.comun.ubicacion.aplicacion.entrada;

import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;

import java.util.List;

public interface CasoUsoObtenerListaEstados {
    public List<Estado> obtenerListaEstados(IdPais idPais);
}
