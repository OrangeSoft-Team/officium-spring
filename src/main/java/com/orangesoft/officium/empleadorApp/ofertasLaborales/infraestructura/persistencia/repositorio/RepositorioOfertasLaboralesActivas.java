package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.Estado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface RepositorioOfertasLaboralesActivas extends JpaRepository<PersistenciaOfertaLaboral, UUID> {

  @Query("SELECT o FROM  OfertasLaborales o WHERE o.estado = 'P' ")
  public List<PersistenciaOfertaLaboral> buscarOfertasLaboralesActivas();
}
