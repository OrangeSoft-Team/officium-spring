package com.orangesoft.officium.administadorApp.administrador.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.personalAdministrativo.PersistenciaPersonalAdministrativo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositorioObtenerAdministrador extends JpaRepository<PersistenciaPersonalAdministrativo, UUID> {
}
