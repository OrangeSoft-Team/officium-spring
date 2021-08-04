package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
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
            " ON o.uuidEmpresa = e.uuid" +
            " WHERE o.uuid = :idOfertaLaboral AND o.estatus = 'PUBLICADO'")
    public Tupla<PersistenciaEmpresa,PersistenciaOfertaLaboral> obtenerDetallesOfertaLaboral(@Param("idOfertaLaboral") UUID idOfertaLaboral);
}
