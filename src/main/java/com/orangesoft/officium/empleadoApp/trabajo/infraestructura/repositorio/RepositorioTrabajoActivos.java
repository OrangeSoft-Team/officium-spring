package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.repositorio;

import com.orangesoft.officium.comun.persistencia.trabajo.PersistenciaTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface RepositorioTrabajoActivos extends JpaRepository<PersistenciaTrabajo, UUID> {

    @Query(value = "FROM trabajos t " +
            " INNER JOIN postulacionesOfertasLaborales p ON p.uuid = t.uuidPostulacion" +
            " WHERE p.estatus = 'EN PROGRESO' AND p.uuidEmpleado = :idEmpleado ")
    public PersistenciaTrabajo obtenerTrabajosActivosEmpleado(@Param("idEmpleado") UUID idEmpleado);
}
