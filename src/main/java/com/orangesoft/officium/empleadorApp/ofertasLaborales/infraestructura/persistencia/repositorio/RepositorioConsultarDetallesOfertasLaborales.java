package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadorApp.Tupla.Tupla;
import com.orangesoft.officium.empleadorApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.UUID;
@Repository
public interface RepositorioConsultarDetallesOfertasLaborales extends JpaRepository<PersistenciaOfertaLaboral, UUID> {

    @Query(value = "SELECT " +
            "new com.orangesoft.officium.comun.generics.TuplaPersistenciaEmpresaOferta(e , o) " +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.idPersistenciaOfertaLaboral.uuidEmpresa = e.uuid" +
            " WHERE o.estado = 'P' AND o.idPersistenciaOfertaLaboral.uuid = :#{#idOfertaLaboral}")
    public Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> consultarDetallesOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);

  }


