package com.orangesoft.officium.comun.ubicacion.aplicacion.entrada;

import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;

import java.util.List;

public interface CasoUsoObtenerListaPaises {
    public List<Pais> obtenerListaPaises();
}
