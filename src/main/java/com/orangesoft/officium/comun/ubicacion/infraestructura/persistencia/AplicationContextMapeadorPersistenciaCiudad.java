package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MappeadorPersistenciaEstado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioEstado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@AllArgsConstructor
public class AplicationContextMapeadorPersistenciaCiudad {
    @Autowired
    protected final RepositorioEstado repositorioEstado;
    @Autowired
    protected final MappeadorPersistenciaEstado mappeadorPersistenciaEstado;
}
