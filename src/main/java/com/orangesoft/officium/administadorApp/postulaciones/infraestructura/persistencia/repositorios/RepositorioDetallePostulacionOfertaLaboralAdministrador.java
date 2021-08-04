package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.query.QDtoDetallePropuestaOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.query.QDtoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.comun.persistencia.postulacionOfertaLaboral.PersistenciaPostulacionOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioDetallePostulacionOfertaLaboralAdministrador extends JpaRepository<PersistenciaPostulacionOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.query.QDtoDetallePropuestaOfertaLaboralAdministrador(" +
            "p.uuid," +
            "p.uuidOferta," +
            "o.titulo," +
            "o.cargo," +
            "p.estatus," +
            "em.uuid," +
            "em.nombre," +
            "e.uuid," +
            "e.primerNombre," +
            "e.primerApellido," +
            "p.comentario" +
            ")" +
            " FROM postulacionesOfertasLaborales p" +
            " INNER JOIN ofertasLaborales o" +
            " ON o.uuid = p.uuidOferta" +
            " INNER JOIN empleados e" +
            " ON e.uuid = p.uuidEmpleado" +
            " INNER JOIN empresas em" +
            " ON em.uuid = o.uuidEmpresa" +
            " WHERE p.uuid = :idPostulacion ")
    public QDtoDetallePropuestaOfertaLaboralAdministrador obtenerDetallePostulacion(@Param("idPostulacion") UUID idPostulacion);
}
