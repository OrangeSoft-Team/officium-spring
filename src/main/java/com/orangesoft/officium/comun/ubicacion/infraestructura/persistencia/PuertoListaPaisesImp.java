package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaPaises;
import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioPais;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoListaPaisesImp implements PuertoListaPaises {
    @Autowired
    private final RepositorioPais repositorioPais;
    @Autowired
    private final MapeadorPersistenciaPais mapeadorPersistenciaPais;

    @Override
    public List<Pais> obtenerListaPaises() {
        return repositorioPais.findAll()
                .stream()
                .map(mapeadorPersistenciaPais::persistenciaAPais)
                .collect(Collectors.toList());
    }
}
