package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoDetalleOfertaLaboralAdministrador;

@Repository
public interface RepositorioDetalleOfertaLaboralAdministrador extends JpaRepository<PersistenciaOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoDetalleOfertaLaboralAdministrador(" +
            "e.nombre," +
            "o.uuidEmpresa," +
            "o.uuid," +
            "o.titulo," +
            "o.fechaPublicacion," +
            "o.fechaUltimaModificacion," +
            "o.cargo," +
            "o.sueldo," +
            "o.descripcion," +
            "o.escalaDuracion," +
            "o.valorDuracion," +
            "o.turnoTrabajo," +
            "o.numeroVacantes," +
            "d.uuid," +
            "o.requisitosEspeciales" +
            ")" +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.uuidEmpresa = e.uuid " +
            " INNER JOIN direcciones d " +
            " ON d.uuid = e.uuidDireccion " +
            " WHERE o.estatus = 'PUBLICADO' " +
            " AND o.uuid = :idOfertaLaboral ")
    public QDtoDetalleOfertaLaboralAdministrador obtenerDetallesOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);
}
