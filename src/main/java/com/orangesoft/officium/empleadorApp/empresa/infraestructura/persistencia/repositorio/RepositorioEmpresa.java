package com.orangesoft.officium.empleadorApp.empresa.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadorApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositorioEmpresa extends JpaRepository<PersistenciaEmpresa, UUID> {
}
