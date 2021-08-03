package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.generics.TripletaPersistenciaEmpresaOfertaPostulacion;
import com.orangesoft.officium.comun.persistencia.postulacionOfertaLaboral.PersistenciaPostulacionOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioPostulacionesOfertaLaborales extends JpaRepository<PersistenciaPostulacionOfertaLaboral, UUID> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.comun.generics.TripletaPersistenciaEmpresaOfertaPostulacion(e,ofl,ost) " +
            "FROM postulacionesOfertasLaborales ost " +
            "INNER JOIN ofertasLaborales ofl ON ofl.uuid = ost.uuidOferta " +
            "INNER JOIN empresas e ON e.uuid = ofl.uuidEmpresa " +
            "WHERE ost.uuidEmpleado = :idEmpleado")
    public List<TripletaPersistenciaEmpresaOfertaPostulacion> obtenerPostulacionesOfertaLaboral(@Param("idEmpleado") UUID idEmpleado);
}
