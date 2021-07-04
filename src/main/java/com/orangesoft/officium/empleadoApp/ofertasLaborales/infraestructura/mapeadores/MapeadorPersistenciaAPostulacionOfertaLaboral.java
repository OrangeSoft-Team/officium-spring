package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.empleadoApp.estadoOfertaLaboral.dominio.EnumEstadoPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersisenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaPostulacionOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class, EnumEstadoPostulacionOfertaLaboral.class, IdPersisenciaPostulacionOfertaLaboral.class})
public abstract class MapeadorPersistenciaAPostulacionOfertaLaboral {

    @Mapping(target = "idPostulacionOfertaLaboral", expression = "java(new IdPersisenciaPostulacionOfertaLaboral(UUID.fromString(postulacionOfertaLaboral.getIdEmpresa().getIdEmpresa()),UUID.fromString(postulacionOfertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral()),UUID.fromString(postulacionOfertaLaboral.getIdEmpleado().getIdEmpleado())))")
    @Mapping(target = "fechaDePostulacion", expression = "java(postulacionOfertaLaboral.getFechaPostulacion().getFechaPostulacion())")
    @Mapping(target = "estado", expression = "java(obtenerEstado(postulacionOfertaLaboral.getEstadoOfertaLaboral().getEstado()))")
    @Mapping(target = "comentario", expression = "java(postulacionOfertaLaboral.getComentarioOfertaLaboral().getComentario())")
    public abstract PersistenciaPostulacionOfertaLaboral mapPostulacionOfertaLaboralAPersistencia(PostulacionOfertaLaboral postulacionOfertaLaboral);

    protected char obtenerEstado(EnumEstadoPostulacionOfertaLaboral estadoPostulacionOfertaLaboral) {
        if(estadoPostulacionOfertaLaboral.equals(EnumEstadoPostulacionOfertaLaboral.APROBADA))
            return 'R';
        if(estadoPostulacionOfertaLaboral.equals(EnumEstadoPostulacionOfertaLaboral.PROCESO))
            return 'P';
        return 'C';
    }
}
