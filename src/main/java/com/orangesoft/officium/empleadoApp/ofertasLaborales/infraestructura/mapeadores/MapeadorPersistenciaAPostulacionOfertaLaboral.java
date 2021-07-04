package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.estadoOfertaLaboral.dominio.EnumEstadoPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.ComentarioOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.EstadoPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.FechaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersisenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaPostulacionOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class,
        EnumEstadoPostulacionOfertaLaboral.class,
        IdPersisenciaPostulacionOfertaLaboral.class,
        IdEmpresa.class,
        IdOfertaLaboral.class,
        IdEmpleado.class,
        FechaPostulacionOfertaLaboral.class,
        ComentarioOfertaLaboral.class,
        EstadoPostulacionOfertaLaboral.class,
        })
public abstract class MapeadorPersistenciaAPostulacionOfertaLaboral {

    @Mapping(target = "idPostulacionOfertaLaboral", expression = "java(new IdPersisenciaPostulacionOfertaLaboral(UUID.fromString(postulacionOfertaLaboral.getIdEmpresa().getIdEmpresa()),UUID.fromString(postulacionOfertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral()),UUID.fromString(postulacionOfertaLaboral.getIdEmpleado().getIdEmpleado())))")
    @Mapping(target = "fechaDePostulacion", expression = "java(postulacionOfertaLaboral.getFechaPostulacion().getFechaPostulacion())")
    @Mapping(target = "estado", expression = "java(obtenerEstado(postulacionOfertaLaboral.getEstadoOfertaLaboral().getEstado()))")
    @Mapping(target = "comentario", expression = "java(postulacionOfertaLaboral.getComentarioOfertaLaboral().getComentario())")
    public abstract PersistenciaPostulacionOfertaLaboral mapPostulacionOfertaLaboralAPersistencia(PostulacionOfertaLaboral postulacionOfertaLaboral);

    protected char obtenerEstado(EnumEstadoPostulacionOfertaLaboral estadoPostulacionOfertaLaboral) {
        if(estadoPostulacionOfertaLaboral.equals(EnumEstadoPostulacionOfertaLaboral.APROBADA))
            return 'A';
        if(estadoPostulacionOfertaLaboral.equals(EnumEstadoPostulacionOfertaLaboral.PROCESO))
            return 'P';
        return 'C';
    }

    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(postulacionOfertaLaboral.getIdPostulacionOfertaLaboral().getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(postulacionOfertaLaboral.getIdPostulacionOfertaLaboral().getUuidOferta().toString()))")
    @Mapping(target = "idEmpleado", expression = "java(new IdEmpleado(postulacionOfertaLaboral.getIdPostulacionOfertaLaboral().getUuidEmpleado().toString()))")
    @Mapping(target = "fechaPostulacion", expression = "java(new FechaPostulacionOfertaLaboral(postulacionOfertaLaboral.getFechaDePostulacion()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoPostulacionOfertaLaboral(obtenerEstado2(postulacionOfertaLaboral.getEstado())))")
    @Mapping(target = "comentarioOfertaLaboral", expression = "java(new ComentarioOfertaLaboral(postulacionOfertaLaboral.getComentario()))")
    public abstract PostulacionOfertaLaboral mapPersistenciaAPostulacioOfertaLaboral(PersistenciaPostulacionOfertaLaboral postulacionOfertaLaboral);

    protected EnumEstadoPostulacionOfertaLaboral obtenerEstado2(char estadoPostulacionOfertaLaboral) {
        if(estadoPostulacionOfertaLaboral=='A')
            return EnumEstadoPostulacionOfertaLaboral.APROBADA;
        if(estadoPostulacionOfertaLaboral == 'P')
            return EnumEstadoPostulacionOfertaLaboral.PROCESO;
        return EnumEstadoPostulacionOfertaLaboral.RECHAZADA;
    }
}
