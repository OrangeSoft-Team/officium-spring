package com.orangesoft.officium.comun.dominio.habilidad.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.habilidad.PersistenciaHabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface RepositorioHabilidades extends JpaRepository<PersistenciaHabilidad, UUID> {
    @Query(value = "SELECT h FROM habilidadesEmpleados he " +
            "INNER JOIN habilidades h ON h.uuid = he.id.uuidHabilidad " +
            "WHERE he.id.uuidEmpleado = :idEmpleado")
    public List<PersistenciaHabilidad> obtenerHabilidadesEmpleado(@Param("idEmpleado") UUID idEmpleado);

    @Query(value = "SELECT h FROM habilidadesOfertas ho " +
            "INNER JOIN habilidades h ON h.uuid = ho.id.uuidHabilidad " +
            "WHERE ho.id.uuidOferta = :idOfertaLaboral")
    public List<PersistenciaHabilidad> obtenerHabilidadesOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);
}
