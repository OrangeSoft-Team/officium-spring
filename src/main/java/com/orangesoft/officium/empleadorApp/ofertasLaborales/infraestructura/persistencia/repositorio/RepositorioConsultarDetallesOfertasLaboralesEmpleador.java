package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.Tupla.Tupla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.UUID;
@Repository
public interface RepositorioConsultarDetallesOfertasLaboralesEmpleador extends JpaRepository<PersistenciaOfertaLaboral, UUID>{
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.comun.generics.TuplaPersistenciaEmpresaOferta(e , o) " +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.uuid= e.uuid" +
            " WHERE o.estatus = 'P' AND o.uuid = :#{#idOfertaLaboral}")
    public Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> consultarDetallesOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);

}
