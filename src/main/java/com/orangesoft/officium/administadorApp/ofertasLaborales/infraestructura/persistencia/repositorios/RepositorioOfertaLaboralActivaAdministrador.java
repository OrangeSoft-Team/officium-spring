package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivasAdministrador;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioOfertaLaboralActivaAdministrador extends JpaRepository<PersistenciaOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivasAdministrador(" +
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
            " WHERE o.estado = 'P'")
    public List<QDtoOfertasLaboralesActivasAdministrador> obtenerListaOfertasLaboralesActivas();
}
