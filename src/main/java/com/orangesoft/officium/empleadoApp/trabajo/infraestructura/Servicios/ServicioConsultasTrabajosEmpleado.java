package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.Servicios;

import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryDetalleDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ConsultasTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.DetalleTrabajoEmpleadoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores.MapeadorPersistenciaDTODetalleTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores.MapeadorPersistenciaDTOTrabajosEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.repositorio.RepositorioTrabajoActivos;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioConsultasTrabajosEmpleado implements ConsultasTrabajo {

    @Autowired
    RepositorioTrabajoActivos repositorioTrabajoActivos;
    @Autowired
    MapeadorPersistenciaDTOTrabajosEmpleado mapeadorPersistenciaDTOTrabajosEmpleado;
    @Autowired
    MapeadorPersistenciaDTODetalleTrabajoEmpleado mapeadorPersistenciaDTODetalleTrabajoEmpleado;

    @Override
    public List<TrabajosEmpleadoDTO> obtenerTrabajosEmpleado(UUID idEmpleado) {
        return repositorioTrabajoActivos.obtenerTrabajosEmpleado(idEmpleado)
                .stream()
                .map(mapeadorPersistenciaDTOTrabajosEmpleado::PersistenciaATrabajosEmpleadoDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DetalleTrabajoEmpleadoDTO obtenerDetalleTrabajo(UUID idTrabajo) {
        QueryDetalleDTO queryDetalleDTO = repositorioTrabajoActivos.obtenerDetalleTrabajo(idTrabajo);
        return mapeadorPersistenciaDTODetalleTrabajoEmpleado.mapeadorPersistenciaDTOTrabajosEmpleado(queryDetalleDTO);
    }
}
