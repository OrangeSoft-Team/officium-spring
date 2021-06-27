package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaCiudades;
import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaCiudad;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    @Override
    public List<Ciudad> obtenerListaCiudades(IdPais idPais, IdEstado idEstado) {
        return repositorioCiudad.findAllByIdPersistenciaCiudad_UuidPaisAndIdPersistenciaCiudad_UuidEstado(
                UUID.fromString(idPais.getIdPais()),
                UUID.fromString(idEstado.getIdEstado()))
                .stream()
                .map(mapeadorPersistenciaCiudad::persistenciaCiudadACiudad)
                .collect(Collectors.toList());
    }
}
