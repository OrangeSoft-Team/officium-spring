package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.repositorio;

import com.orangesoft.officium.comun.persistencia.trabajo.PersistenciaTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryConsultaTrabajoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryDetalleDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioTrabajoActivos extends JpaRepository<PersistenciaTrabajo, UUID> {

    @Query(value = "FROM trabajos t " +
            " INNER JOIN postulacionesOfertasLaborales p ON p.uuid = t.uuidPostulacion" +
            " WHERE p.estatus = 'EN PROGRESO' AND p.uuidEmpleado = :idEmpleado ")
    public PersistenciaTrabajo obtenerTrabajosActivosEmpleado(@Param("idEmpleado") UUID idEmpleado);

    @Query(value = "SELECT new com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryConsultaTrabajoDTO(" +
            " t.uuid, " +
            " o.titulo," +
            " t.fechaInicio," +
            " o.cargo," +
            " e.nombre," +
            " t.estatus" +
            " )" +
            " FROM trabajos t" +
            " INNER JOIN postulacionesOfertasLaborales p ON p.uuid = t.uuidPostulacion" +
            " INNER JOIN ofertasLaborales o ON o.uuid = p.uuidOferta " +
            " INNER JOIN empresas e ON e.uuid = o.uuidEmpresa" +
            " WHERE p.uuidEmpleado = :idEmpleado ")
    public List<QueryConsultaTrabajoDTO> obtenerTrabajosEmpleado(@Param("idEmpleado") UUID idEmpleado);

    @Query(value = "SELECT new com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryDetalleDTO( " +
            " t.uuid, " +
            " o.titulo, " +
            " t.fechaInicio, " +
            " o.cargo, " +
            " e.uuid, " +
            " e.nombre, " +
            " d.calleUno, " +
            " e.nombre, " +
            " t.estatus, " +
            " o.sueldo, " +
            " o.descripcion, " +
            " o.valorDuracion, " +
            " o.escalaDuracion, " +
            " o.turnoTrabajo, " +
            " t.fechaCulminacion" +
            " ) " +
            " FROM trabajos t" +
            " INNER JOIN postulacionesOfertasLaborales p ON p.uuid = t.uuidPostulacion" +
            " INNER JOIN ofertasLaborales o ON o.uuid = p.uuidOferta " +
            " INNER JOIN empresas e ON e.uuid = o.uuidEmpresa" +
            " INNER JOIN direcciones d ON d.uuid = e.uuidDireccion" +
            " WHERE p.uuidEmpleado = :idTrabajo ")
    public QueryDetalleDTO obtenerDetalleTrabajo(@Param("idTrabajo") UUID idTrabajo);
}
