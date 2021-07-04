package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralEmpresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports ={UUID.class} )
public abstract class MapeadorOfertaLaboralDetalleDTO {
    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacion().getFechaPublicacion().toString())")
    @Mapping(target = "fechaModificacion", expression = "java(ofertaLaboral.getFechaUltimaModificacion().toString())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().getDescripcion())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaValor().getDuracionEstimadaValor())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaEscala().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "uuidEmpresa", expression = "java(empresa.getIdEmpresa().getIdEmpresa())")
    @Mapping(target = "empresaNombre", expression = "java(empresa.getNombreEmpresa().getNombreEmpresa())")
    @Mapping(target = "direccionEmpresa", expression = "java(empresa.getDireccionEmpresa().getDireccionEmpresa())")
    public abstract DtoDetalleOfertaLaboralEmpresa mapOfertaLaboralADetalleDto(Empresa empresa, OfertaLaboral ofertaLaboral);
}
