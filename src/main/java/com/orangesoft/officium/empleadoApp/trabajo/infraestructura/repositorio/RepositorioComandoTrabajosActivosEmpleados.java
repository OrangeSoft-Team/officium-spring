package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.repositorio;

import com.orangesoft.officium.comun.persistencia.trabajo.PersistenciaTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RepositorioComandoTrabajosActivosEmpleados extends JpaRepository<PersistenciaTrabajo, UUID> {
    @Query(value = "FROM trabajos t " +
            " INNER JOIN postulacionesOfertasLaborales p ON p.uuid = t.uuidPostulacion " +
            " WHERE t.uuid = :idTrabajo AND p.uuidEmpleado = :idEmpleado")
    public PersistenciaTrabajo verificarlePerteneceOfertaLaboral(@Param("idEmpleado") UUID idEmpleado, @Param("idTrabajo") UUID idTrabajo);

    @Query(value = "UPDATE trabajos t SET t.estatus = :estatus WHERE t.uuid = :idTrabajo")
    public void renuciarTrabajoOferaLaboral(@Param("idTrabajo") UUID idTrabajo, @Param("estatus") String estatus);
}
