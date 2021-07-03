package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RepositorioOfertasLaboralesActivas extends JpaRepository<PersistenciaOfertaLaboral, UUID> {

}
