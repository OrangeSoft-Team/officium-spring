package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.repositorios.RepositorioEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioDetallesOfertaLaboral extends JpaRepository<PersistenciaOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.comun.generics.TuplaPersistenciaEmpresaOferta(e , o) " +
            " FROM ofertasLaborales o " +
            " INNER JOIN empresas e " +
            " ON o.idPersistenciaOfertaLaboral.uuidEmpresa = e.uuid" +
            " WHERE o.estado = 'P' AND o.idPersistenciaOfertaLaboral.uuid = :#{#idOfertaLaboral}")
    public Tupla<PersistenciaEmpresa,PersistenciaOfertaLaboral> obtenerDetallesOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);
}
