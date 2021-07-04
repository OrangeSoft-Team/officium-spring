package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface RepositorioOfertasLaboralesActivasEmpleador extends JpaRepository<PersistenciaOfertaLaboral, UUID> {

  @Query("SELECT o FROM  ofertasLaborales o WHERE o.estado = 'P' AND o.idPersistenciaOfertaLaboral.uuidEmpresa = :idEmpresa ")
  public List<PersistenciaOfertaLaboral> buscarOfertasLaboralesActivas(@Param("idEmpresa") UUID idEmpresa);
}
