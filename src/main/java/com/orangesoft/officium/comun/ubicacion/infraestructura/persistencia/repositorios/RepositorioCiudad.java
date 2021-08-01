package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaCiudad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RepositorioCiudad extends JpaRepository<PersistenciaCiudad, UUID> {
    public List<PersistenciaCiudad> findAllByUuidEstado(UUID estado);
}
