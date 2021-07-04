package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;

@Repository
public interface RepositorioCrearOfertaLaboral extends JpaRepository<PersistenciaOfertaLaboral, UUID> {

}
