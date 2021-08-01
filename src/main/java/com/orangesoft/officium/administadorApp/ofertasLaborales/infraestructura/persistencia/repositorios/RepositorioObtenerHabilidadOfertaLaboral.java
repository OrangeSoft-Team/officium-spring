package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.habilidad.PersistenciaHabilidad;
import com.orangesoft.officium.comun.persistencia.habilidadesOfertaLaboral.PersistenciaHabilidadOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioObtenerHabilidadOfertaLaboral extends JpaRepository<PersistenciaHabilidadOfertaLaboral, UUID> {
    @Query(value = "SELECT h FROM habilidades h " +
                    "JOIN habilidadesOfertas ho ON ho.id.uuidHabilidad = h.uuid " +
                    "WHERE ho.id.uuidOferta = :idOfertaLaboral")
    public List<PersistenciaHabilidad> obtenerHabilidadesPorIdOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);
}
