package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaCiudades;
import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MappeadorPersistenciaEstado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioEstado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoListaCiudadesImp implements PuertoListaCiudades {
    @Autowired
    private final RepositorioCiudad repositorioCiudad;
    @Autowired
    private final MapeadorPersistenciaCiudad mapeadorPersistenciaCiudad;
    @Autowired
    private final RepositorioEstado repositorioEstado;
    @Autowired
    private final MappeadorPersistenciaEstado mappeadorPersistenciaEstado;

    @Override
    public List<Ciudad> obtenerListaCiudades(IdPais idPais, IdEstado idEstado) {
        List<Ciudad> ciudadLista = new ArrayList<>();
        repositorioCiudad.findAllByUuidEstado(
                idEstado.getUuid())
                .forEach(persistenciaCiudad -> {
                    ciudadLista.add(mapeadorPersistenciaCiudad.persistenciaCiudadACiudad(persistenciaCiudad, repositorioEstado.getById(persistenciaCiudad.getUuidEstado())));
                });
        return ciudadLista;
    }
}
