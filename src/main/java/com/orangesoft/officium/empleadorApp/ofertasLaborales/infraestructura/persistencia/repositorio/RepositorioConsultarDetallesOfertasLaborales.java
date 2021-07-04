package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.UUID;
@Repository
public interface RepositorioConsultarDetallesOfertasLaborales extends JpaRepository<PersistenciaOfertaLaboral, UUID> {
    List<OfertaLaboral> consultarDetalleOfertasLaborales();
}
