package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto.DtoPostulacionesOfertaLaboralAdministrador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class MapeadorDtoPostulacionesOfertaLaboralAdministrador {
    @Mapping(target = "uuid", expression = "java(postulacionOfertaLaboralAdministrador.getIdPostulacion().getUuid())")
    @Mapping(target = "tituloOferta", expression = "java(postulacionOfertaLaboralAdministrador.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "cargoOferta", expression = "java(postulacionOfertaLaboralAdministrador.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "estatus", expression = "java(postulacionOfertaLaboralAdministrador.getEstatusPostulacionOfertaLaboral().toString())")
    @Mapping(target = "nombreEmpresa", expression = "java(postulacionOfertaLaboralAdministrador.getNombreEmpresa().getNombreEmpresa())")
    @Mapping(target = "nombreEmpleado", expression = "java(postulacionOfertaLaboralAdministrador.getNombreEmpleado().getNombreEmpleado())")
    public abstract DtoPostulacionesOfertaLaboralAdministrador mapQDtoAPostulacion (PostulacionOfertaLaboralAdministrador postulacionOfertaLaboralAdministrador);
}
