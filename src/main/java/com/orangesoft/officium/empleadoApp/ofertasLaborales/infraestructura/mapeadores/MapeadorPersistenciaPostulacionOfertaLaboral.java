package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.postulacionOfertaLaboral.EnumEstatusPostulacionOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.postulacionOfertaLaboral.PersistenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        IdPostulacionOfertaLaboral.class,
        FechaPostulacionOfertaLaboral.class,
        EstadoPostulacionOfertaLaboral.class,
        IdOfertaLaboral.class,
        IdEmpleado.class,
        ComentarioPostulacionOfertaLaboral.class,
        EnumEstatusOfertaLaboral.class,
        EnumEstatusPostulacionOfertaLaboral.class
        })
public abstract class MapeadorPersistenciaPostulacionOfertaLaboral {
        @Mapping(target = "idPostulacionOfertaLaboral", expression = "java(new IdPostulacionOfertaLaboral(persistenciaPostulacionOfertaLaboral.getUuid()))")
        @Mapping(target = "fechaPostulacionOfertaLaboral", expression = "java(new FechaPostulacionOfertaLaboral(persistenciaPostulacionOfertaLaboral.getFechaPostulacion()))")
        @Mapping(target = "estadoPostulacionOfertaLaboral", expression = "java(new EstadoPostulacionOfertaLaboral(convierte(persistenciaPostulacionOfertaLaboral.getEstatus())))")
        @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaPostulacionOfertaLaboral.getUuidOferta()))")
        @Mapping(target = "idEmpleado", expression = "java(new IdEmpleado(persistenciaPostulacionOfertaLaboral.getUuidEmpleado()))")
        @Mapping(target = "comentarioPostulacionOfertaLaboral", expression = "java(new ComentarioPostulacionOfertaLaboral(persistenciaPostulacionOfertaLaboral.getComentario()))")
        public abstract PostulacionOfertaLaboral PersistenciaAPostulacionOfertaLaboral(PersistenciaPostulacionOfertaLaboral persistenciaPostulacionOfertaLaboral);

        @Mapping(target = "uuid", expression = "java(postulacionOfertaLaboral.getIdPostulacionOfertaLaboral().getUuid())")
        @Mapping(target = "fechaPostulacion", expression = "java(postulacionOfertaLaboral.getFechaPostulacionOfertaLaboral().getFechaPostulacion())")
        @Mapping(target = "estatus", expression = "java(postulacionOfertaLaboral.getEstadoPostulacionOfertaLaboral().getEstado() == EnumEstatusPostulacionOfertaLaboral.EN_PROCESO ?  \"EN PROCESO\" : postulacionOfertaLaboral.getEstadoPostulacionOfertaLaboral().getEstado().toString())")
        @Mapping(target = "uuidOferta", expression = "java(postulacionOfertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())")
        @Mapping(target = "uuidEmpleado", expression = "java(postulacionOfertaLaboral.getIdEmpleado().getIdEmpleado())")
        @Mapping(target = "comentario", expression = "java(postulacionOfertaLaboral.getComentarioPostulacionOfertaLaboral().getComentario())")
        public abstract PersistenciaPostulacionOfertaLaboral PostulacionOfertaLaboralAPersistencia(PostulacionOfertaLaboral postulacionOfertaLaboral);

        protected EnumEstatusPostulacionOfertaLaboral convierte(String string) {
               return string.equals("EN PROCESO") ? EnumEstatusPostulacionOfertaLaboral.EN_PROCESO : EnumEstatusPostulacionOfertaLaboral.valueOf(string);
        }
}
