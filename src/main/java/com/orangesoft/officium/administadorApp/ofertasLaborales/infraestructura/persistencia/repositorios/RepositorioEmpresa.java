package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioEmpresa extends JpaRepository<PersistenciaEmpresa, UUID> {
    public PersistenciaEmpresa getPersistenciaEmpresaByUuid(UUID uuid);
}
