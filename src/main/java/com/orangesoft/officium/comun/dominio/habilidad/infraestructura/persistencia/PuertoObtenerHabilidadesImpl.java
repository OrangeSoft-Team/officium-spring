package com.orangesoft.officium.comun.dominio.habilidad.infraestructura.persistencia;

import com.orangesoft.officium.comun.dominio.habilidad.aplicacion.salida.PuertoObtenerListaHabilidades;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorPersistenciaHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.persistencia.repositorios.RepositorioHabilidades;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoObtenerHabilidadesImpl implements PuertoObtenerListaHabilidades {
    @Autowired
    private final RepositorioHabilidades repositorioHabilidades;
    @Autowired
    private final MapeadorPersistenciaHabilidad mapeadorPersistenciaAHabilidad;

    @Override
    public List<Habilidad> obtenerListaHabilidades() {
        return repositorioHabilidades.findAll()
                .stream()
                .map(mapeadorPersistenciaAHabilidad::PersistenciaAHabilidad)
                .collect(Collectors.toList());
    }
}
