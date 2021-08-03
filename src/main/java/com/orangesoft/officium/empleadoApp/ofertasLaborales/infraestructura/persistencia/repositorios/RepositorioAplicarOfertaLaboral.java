package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.postulacionOfertaLaboral.PersistenciaPostulacionOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioAplicarOfertaLaboral extends JpaRepository<PersistenciaPostulacionOfertaLaboral, UUID> {

}
