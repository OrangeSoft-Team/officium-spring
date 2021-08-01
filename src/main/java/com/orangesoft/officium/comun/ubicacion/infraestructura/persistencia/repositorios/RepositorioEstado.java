package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaEstado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface RepositorioEstado extends JpaRepository<PersistenciaEstado, UUID> {
    public List<PersistenciaEstado> findAllByUuidPais(UUID uuidPais);
}
