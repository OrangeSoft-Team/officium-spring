package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboralEmpleador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface RepositorioOfertasLaboralesActivasEmpleador extends JpaRepository<PersistenciaOfertaLaboralEmpleador, UUID> {

  @Query("SELECT o FROM  ofertasLaborales o WHERE o.estado = 'P' AND o.idPersistenciaOfertaLaboral.uuidEmpresa = :uuidEmpresa")
  public List<PersistenciaOfertaLaboralEmpleador> buscarOfertasLaboralesActivas(@Param("uuidEmpresa") UUID uuidEmpresa);
}
