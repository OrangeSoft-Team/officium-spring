package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.generics.TripletaPersistenciaEmpresaOfertaPostulacion;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersisenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaPostulacionOfertaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositorioPostulacionesOfertaLaborales extends JpaRepository<PersistenciaPostulacionOfertaLaboral, IdPersisenciaPostulacionOfertaLaboral> {
    @Query(value = "SELECT " +
            "new com.orangesoft.officium.comun.generics.TripletaPersistenciaEmpresaOfertaPostulacion(e,ofl,ost) " +
            "FROM postulacionOfertaLaboral ost " +
            "INNER JOIN empresas e ON e.uuid = ost.idPostulacionOfertaLaboral.uuidEmpresa " +
            "INNER JOIN ofertasLaborales ofl ON ofl.idPersistenciaOfertaLaboral.uuid = ost.idPostulacionOfertaLaboral.uuidOferta " +
            "WHERE ost.idPostulacionOfertaLaboral.uuidEmpleado = :idEmpleado")
    public List<TripletaPersistenciaEmpresaOfertaPostulacion> obtenerPostulacionesOfertaLaboral(@Param("idEmpleado") UUID idEmpleado);
}
