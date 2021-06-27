package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaEstados;
import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MappeadorPersistenciaEstado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoListaEstadosImp implements PuertoListaEstados {
    @Autowired
    private final RepositorioEstado repositorioEstado;
    @Autowired
    private final MappeadorPersistenciaEstado mappeadorPersistenciaEstado;
    @Override
    public List<Estado> obtenerListaPaises(IdPais idPais) {
        return repositorioEstado.findAllByIdPersistenciaEstado_UuidPais(UUID.fromString(idPais.getIdPais()))
                .stream()
                .map(mappeadorPersistenciaEstado::persistenciaAEstado)
                .collect(Collectors.toList());
    }
}
