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
    // TODO AGREGAR OBTENCION DE REQUISITOS ESPECIALES
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivasAdministrador(" +
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
            "o.estatus," +
            "o.requisitosEspeciales" +
            ")" +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.uuidEmpresa = e.uuid" +
            " WHERE o.estatus = 'PUBLICADO'")
    public List<QDtoOfertasLaboralesActivasAdministrador> obtenerListaOfertasLaboralesActivas();
}
