package com.orangesoft.officium.empleadorApp.empresa.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioEmpresaEmpleador extends JpaRepository<PersistenciaEmpresa, UUID> {
 public PersistenciaEmpresa getPersistenciaEmpresaByUuid(UUID uuid);
}
