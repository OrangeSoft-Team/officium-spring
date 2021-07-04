package com.orangesoft.officium.empleadoApp.empleado.infraestructura.repositorios;

import com.orangesoft.officium.comun.persistencia.empleado.PersistenciaEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioEmpleado extends JpaRepository<PersistenciaEmpleado, UUID> {

    @Query("SELECT e FROM empleados e WHERE e.uuid = :idEmpleado AND e.activo=true")
    public PersistenciaEmpleado buscarEmpleadoActivosPorId(@Param("idEmpleado") UUID idEmpleado);
}
