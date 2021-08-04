package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaAdministrador;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        EnumEscalaDuracionOfertaLaboral.class,
        EnumTurnoOfertaLaboral.class,
        UUID.class})
public abstract class MapeadorDtoDetalleOfertasLaboralActivaAdministrador {

    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral().toString())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaOfertaLaboral())")
    @Mapping(target = "fechaModificacion", expression = "java(ofertaLaboral.getFechaUltimaModificacionOfertaLaboral().getFechaOfertaLaboral())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldoOfertaLaboral())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcionOfertaLaboral())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
    @Mapping(target = "uuidEmpresa", expression = "java(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa().toString())")
    @Mapping(target = "empresaNombre", expression = "java(ofertaLaboral.getNombreEmpresaOfertaLaboral().getNombreEmpresa())")
    @Mapping(target = "direccionEmpresa", expression = "java(ofertaLaboral.getDireccionOfertaLaboral().toString())")
    public abstract DtoDetalleOfertaLaboralActivaAdministrador mapOfertaLaboralADto(OfertaLaboral ofertaLaboral);

    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(UUID.fromString(dtoDetalleOfertaLaboralActivaAdministrador.getUuid())))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getTitulo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getFechaPublicacion()))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getFechaModificacion()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getDuracionEstimadaValor(), EnumEscalaDuracionOfertaLaboral.valueOf(dtoDetalleOfertaLaboralActivaAdministrador.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.valueOf(dtoDetalleOfertaLaboralActivaAdministrador.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getNumeroVacantes()))")
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(UUID.fromString(dtoDetalleOfertaLaboralActivaAdministrador.getUuidEmpresa())))")
    @Mapping(target = "nombreEmpresaOfertaLaboral", expression = "java(new NombreEmpresa(dtoDetalleOfertaLaboralActivaAdministrador.getEmpresaNombre()))")
    @Mapping(target = "requisitosEspecialesOfertaLaboral", expression = "java(new RequisitosEspecialesOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getRequisitosEspeciales()))")
    // TODO Verificar si es necesario colocar la asignacion de habilidades
    //@Mapping(target = "idCiudadOfertaLaboral", expression = "java(new IdCiudad(dtoDetalleOfertaLaboralActivaAdministrador.getDireccionEmpresa()))")
    public abstract OfertaLaboral mapDtoAOfertaLaboral (DtoDetalleOfertaLaboralActivaAdministrador dtoDetalleOfertaLaboralActivaAdministrador);
}
