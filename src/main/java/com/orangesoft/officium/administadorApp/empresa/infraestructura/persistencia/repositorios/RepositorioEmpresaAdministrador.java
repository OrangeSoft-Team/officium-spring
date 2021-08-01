package com.orangesoft.officium.administadorApp.empresa.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioEmpresaAdministrador extends JpaRepository<PersistenciaEmpresa, UUID> {
    public PersistenciaEmpresa getPersistenciaEmpresaByUuid(UUID uuid);
}
