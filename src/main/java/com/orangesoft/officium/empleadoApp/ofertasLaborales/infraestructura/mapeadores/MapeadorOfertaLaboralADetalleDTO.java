package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorHabilidadDTO;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Mapper(componentModel = "spring", imports ={
        UUID.class
} )
public abstract class MapeadorOfertaLaboralADetalleDTO {
    @Autowired
    protected MapeadorHabilidadDTO mapeadorHabilidadDTO;

    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral().toString())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaPublicacion().toString())")
    @Mapping(target = "fechaModificacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaUltimaModificacion().toString())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldo())")
    @Mapping(target = "divisa", expression = "java(com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda.USD.toString())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcion())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimada())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getEscalaTiempo().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajo().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "requisitosEspecialesEspecificos", expression = "java(ofertaLaboral.getRequisitosEspecialesOfertaLaboral().getRequisitosEspeciales())")
    @Mapping(target = "requisitosEspecialesGenerales", expression = "java(ofertaLaboral.getRequisitosEspecialesOfertaLaboral().getRequisitosEspeciales())")
    @Mapping(target = "uuidEmpresa", expression = "java(empresa.getIdEmpresa().getIdEmpresa().toString())")
    @Mapping(target = "empresaNombre", expression = "java(empresa.getNombreEmpresa().getNombreEmpresa())")
    @Mapping(target = "direccionEmpresa", expression = "java(empresa.getDireccionEmpresa().getIdDireccion().toString())")
    @Mapping(target = "habilidades", expression = "java(ofertaLaboral.getHabilidades().stream().map(mapeadorHabilidadDTO::HabilidadADtoHabilidad).collect(java.util.stream.Collectors.toList()))")
    public abstract DtoDetalleOfertaLaboralActivaEmpleado mapOfertaLaboralADetalleDto(Empresa empresa, OfertaLaboral ofertaLaboral);
}
