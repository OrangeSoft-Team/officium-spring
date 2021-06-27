package com.orangesoft.officium.comun.ubicacion.aplicacion.entrada;

import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;

import java.util.List;

public interface CasoUsoObtenerListaCiudades {
    public List<Ciudad> obtenerListaCiudades(IdPais idPais, IdEstado idEstado);
}
