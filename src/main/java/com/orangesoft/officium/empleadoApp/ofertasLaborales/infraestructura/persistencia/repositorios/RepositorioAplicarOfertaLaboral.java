package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaPostulacionOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAplicarOfertaLaboral extends JpaRepository<PersistenciaPostulacionOfertaLaboral, IdPersistenciaOfertaLaboral> {

}
