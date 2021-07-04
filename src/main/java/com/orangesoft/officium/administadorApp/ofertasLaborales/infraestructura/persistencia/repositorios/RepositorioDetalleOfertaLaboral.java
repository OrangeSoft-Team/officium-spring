package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoDetalleOfertaLaboral;

@Repository
public interface RepositorioDetalleOfertaLaboral extends JpaRepository<PersistenciaOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoDetalleOfertaLaboral(" +
            "e.nombre," +
            "o.idPersistenciaOfertaLaboral.uuidEmpresa," +
            "o.idPersistenciaOfertaLaboral.uuid," +
            "o.titulo," +
            "o.fechaPublicacion," +
            "o.fechaUltimaModificacion," +
            "o.cargo," +
            "o.sueldo," +
            "o.descripcion," +
            "o.duracionEstimadaEscala," +
            "o.duracionEstimada," +
            "o.turnoTrabajo," +
            "o.numeroVacantes," +
            "c.nombre" +
            ")" +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.idPersistenciaOfertaLaboral.uuidEmpresa = e.uuid " +
            " INNER JOIN ciudades c " +
            " ON c.idPersistenciaCiudad.uuid = e.idCiudad " +
            " WHERE o.estado = 'P' " +
            " AND o.idPersistenciaOfertaLaboral.uuid = :idOfertaLaboral ")
    public QDtoDetalleOfertaLaboral obtenerDetallesOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);
}
