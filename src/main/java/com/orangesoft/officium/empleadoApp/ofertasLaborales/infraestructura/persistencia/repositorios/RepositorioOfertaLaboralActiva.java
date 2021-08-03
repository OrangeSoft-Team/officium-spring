package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;


import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import org.hibernate.annotations.ParamDef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioOfertaLaboralActiva extends JpaRepository<PersistenciaOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas(" +
            "e.nombre," +
            "o.uuidEmpresa," +
            "o.uuid," +
            "o.titulo," +
            "o.fechaPublicacion," +
            "o.fechaLimite," +
            "o.fechaUltimaModificacion," +
            "o.cargo," +
            "o.sueldo," +
            "o.descripcion," +
            "o.escalaDuracion," +
            "o.valorDuracion," +
            "o.turnoTrabajo," +
            "o.numeroVacantes," +
            "o.estatus," +
            "o.requisitosEspeciales" +
            ")" +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.uuidEmpresa = e.uuid" +
            " WHERE o.estatus = 'PUBLICADO' AND o.fechaLimite > current_timestamp")
    public List<QDtoOfertasLaboralesActivas> obtenerListaOfertasLaboralesActivas();
}
