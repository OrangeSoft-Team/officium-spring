package com.orangesoft.officium.empleadoApp.empleado.infraestructura.repositorios;

import com.orangesoft.officium.comun.dominio.empleado.EnumEstatusEmpleado;
import com.orangesoft.officium.comun.persistencia.empleado.PersistenciaEmpleado;
import com.orangesoft.officium.comun.seguridad.autenticacion.repositorios.RepositorioObtenerPersistenciaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioEmpleado extends RepositorioObtenerPersistenciaUsuario<PersistenciaEmpleado> {
    String estatusActivo = EnumEstatusEmpleado.DISPONIBLE.toString();

    @Query("SELECT e FROM empleados e WHERE e.uuid = :idEmpleado")
    public PersistenciaEmpleado obtenerPersistencia(@Param("idEmpleado") UUID idEmpleado);

    @Query("SELECT e FROM empleados e WHERE e.uuid = :idEmpleado AND e.estatus='DISPONIBLE'")
    public PersistenciaEmpleado buscarEmpleadoActivosPorId(@Param("idEmpleado") UUID idEmpleado);
}
