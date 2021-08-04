package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;


import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioOfertaLaboralInactivasEmpleador extends  JpaRepository<PersistenciaOfertaLaboral, UUID>  {
    @Query("SELECT o FROM  ofertasLaborales o WHERE o.estatus = 'I' AND o.uuidEmpresa = :idEmpresa ")
    public List<PersistenciaOfertaLaboral> buscarOfertasLaboralesInactivas(@Param("idEmpresa") UUID idEmpresa);
}

