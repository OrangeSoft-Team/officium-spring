package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.direccion.PersistenciaDireccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface RepositorioDireccion extends JpaRepository<PersistenciaDireccion, UUID> {
    @Query("SELECT d FROM empresas e " +
            "INNER JOIN direcciones d ON d.uuid = e.uuidDireccion " +
            "WHERE e.uuid = :idEmpresa")
    public PersistenciaDireccion buscarDireccionIdEmpresa(@Param("idEmpresa") UUID idEmpresa);

    @Query("SELECT d FROM empleados e " +
            "INNER JOIN direcciones d ON d.uuid = e.uuidDireccion " +
            "WHERE e.uuid = :idEmpleado")
    public PersistenciaDireccion buscarDireccionIdEmpleado(@Param("idEmpleado") UUID idEmpleado);
}
