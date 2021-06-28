package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaPais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioPais extends JpaRepository<PersistenciaPais, UUID> {
}
