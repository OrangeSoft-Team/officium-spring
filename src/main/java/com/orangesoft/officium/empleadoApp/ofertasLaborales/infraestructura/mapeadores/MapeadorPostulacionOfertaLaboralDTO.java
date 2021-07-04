package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoConsultarPostulacionesOfertasLaboralesEmpleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class})
public abstract class MapeadorPostulacionOfertaLaboralDTO {
    @Mapping(target = "uuid", expression = "java(empresa.getIdEmpresa().getIdEmpresa())")
    @Mapping(target = "uuidOfertaLabora", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTitulo())")
    @Mapping(target = "cargoOferta", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargo())")
    @Mapping(target = "empresaNombre", expression = "java(empresa.getNombreEmpresa().getNombreEmpresa())")
    @Mapping(target = "comentario", expression = "java(postulacionOfertaLaboral.getComentarioOfertaLaboral().getComentario())")
    public abstract DtoConsultarPostulacionesOfertasLaboralesEmpleado mapPostulacionOfertasLaboralesADto(Empresa empresa, OfertaLaboral ofertaLaboral, PostulacionOfertaLaboral postulacionOfertaLaboral);
}
