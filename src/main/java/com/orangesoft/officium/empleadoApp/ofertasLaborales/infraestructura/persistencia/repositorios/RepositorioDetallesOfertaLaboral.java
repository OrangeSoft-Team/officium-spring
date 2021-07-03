package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioDetallesOfertaLaboral extends JpaRepository<PersistenciaOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas(" +
            "e.nombre," +
            "o.idPersistenciaOfertaLaboral.uuidEmpresa," +
            "o.idPersistenciaOfertaLaboral.uuid," +
            "o.titulo," +
            "o.fechaPublicacion," +
            "o.fechaUltimaModificacion," +
            "o.cargo," +
            "o.sueldo," +
            "o.divisa," +
            "o.descripcion," +
            "o.duracionEstimadaEscala," +
            "o.duracionEstimada," +
            "o.turnoTrabajo," +
            "o.numeroVacantes," +
            "o.estado" +
            ")" +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.idPersistenciaOfertaLaboral.uuidEmpresa = e.uuid" +
            " WHERE o.estado = 'P' AND o.idPersistenciaOfertaLaboral.uuid = :#{#idOfertaLaboral.idOfertaLaboral}")
    public List<QDtoOfertasLaboralesActivas> obtenerDetallesOfertaLaboral(@Param("id") IdOfertaLaboral idOfertaLaboral);
}
