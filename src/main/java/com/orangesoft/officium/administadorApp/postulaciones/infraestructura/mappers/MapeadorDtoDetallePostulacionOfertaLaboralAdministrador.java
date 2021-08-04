package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoDetallePostulacionOfertaLaboralAdministrador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class MapeadorDtoDetallePostulacionOfertaLaboralAdministrador {
    @Mapping(target = "uuid", expression = "java(postulacionOfertaLaboralAdministrador.getIdPostulacion().getUuid())")
    @Mapping(target = "uuidOfertaLaboral", expression = "java(postulacionOfertaLaboralAdministrador.getIdOfertaLaboral().getIdOfertaLaboral())")
    @Mapping(target = "tituloOferta", expression = "java(postulacionOfertaLaboralAdministrador.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "cargoOferta", expression = "java(postulacionOfertaLaboralAdministrador.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "estatus", expression = "java(postulacionOfertaLaboralAdministrador.getEstatusPostulacionOfertaLaboral().toString())")
    @Mapping(target = "uuidEmpresa", expression = "java(postulacionOfertaLaboralAdministrador.getIdEmpresa().getIdEmpresa())")
    @Mapping(target = "nombreEmpresa", expression = "java(postulacionOfertaLaboralAdministrador.getNombreEmpresa().getNombreEmpresa())")
    @Mapping(target = "uuidEmpleado", expression = "java(postulacionOfertaLaboralAdministrador.getIdEmpleado().getUuid())")
    @Mapping(target = "nombreEmpleado", expression = "java(postulacionOfertaLaboralAdministrador.getNombreEmpleado().getNombreEmpleado())")
    @Mapping(target = "comentario", expression = "java(postulacionOfertaLaboralAdministrador.getComentarioPostulacion().getComentarioPostulacion())")
    public abstract DtoDetallePostulacionOfertaLaboralAdministrador mapDtoAPostulacion (PostulacionOfertaLaboralAdministrador postulacionOfertaLaboralAdministrador);
}
