package com.orangesoft.officium.empleadoApp.habilidad.infraestructura.persistencia;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.habilidad.aplicacion.salida.PuertoObtenerHabilidadesEmpleado;
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
public class PuertoObtenerHabilidadesEmpleadoImpl implements PuertoObtenerHabilidadesEmpleado {
    @Autowired
    private final RepositorioHabilidades repositorioHabilidades;
    @Autowired
    private final MapeadorPersistenciaHabilidad mapeadorPersistenciaAHabilidad;

    @Override
    public List<Habilidad> obtenerHabilidadesEmpleado(IdEmpleado idEmpleado) {
        return repositorioHabilidades.obtenerHabilidadesEmpleado(idEmpleado.getIdEmpleado())
                .stream()
                .map(mapeadorPersistenciaAHabilidad::PersistenciaAHabilidad)
                .collect(Collectors.toList());
    }
}
