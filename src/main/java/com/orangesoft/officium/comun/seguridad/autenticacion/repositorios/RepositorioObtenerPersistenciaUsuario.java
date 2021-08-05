package com.orangesoft.officium.comun.seguridad.autenticacion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface RepositorioObtenerPersistenciaUsuario<U> extends JpaRepository<U, UUID> {
    public U obtenerPersistencia(UUID idAdmin);
}
