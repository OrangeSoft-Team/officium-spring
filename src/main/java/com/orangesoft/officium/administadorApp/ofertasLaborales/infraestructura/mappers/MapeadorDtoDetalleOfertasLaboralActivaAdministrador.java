package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.PeriodoTiempo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaAdministrador;

@Mapper(componentModel = "spring", imports = {PeriodoTiempo.class})
public abstract class MapeadorDtoDetalleOfertasLaboralActivaAdministrador {

    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaOfertaLaboral())")
    @Mapping(target = "fechaModificacion", expression = "java(ofertaLaboral.getFechaUltimaModificacionOfertaLaboral().getFechaOfertaLaboral())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldoOfertaLaboral())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcionOfertaLaboral())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
    @Mapping(target = "uuidEmpresa", expression = "java(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa())")
    @Mapping(target = "empresaNombre", expression = "java(ofertaLaboral.getNombreEmpresaOfertaLaboral().getNombreEmpresa())")
    @Mapping(target = "direccionEmpresa", expression = "java(ofertaLaboral.getIdCiudadOfertaLaboral().getIdCiudad())")
    public abstract DtoDetalleOfertaLaboralActivaAdministrador mapOfertaLaboralADto(OfertaLaboral ofertaLaboral);

    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getUuid()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getTitulo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getFechaPublicacion()))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getFechaModificacion()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getDuracionEstimadaValor(), PeriodoTiempo.obtenerPeriodoTiempo(dtoDetalleOfertaLaboralActivaAdministrador.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(dtoDetalleOfertaLaboralActivaAdministrador.getNumeroVacantes()))")
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(dtoDetalleOfertaLaboralActivaAdministrador.getUuidEmpresa()))")
    @Mapping(target = "nombreEmpresaOfertaLaboral", expression = "java(new NombreEmpresa(dtoDetalleOfertaLaboralActivaAdministrador.getEmpresaNombre()))")
    //@Mapping(target = "idCiudadOfertaLaboral", expression = "java(new IdCiudad(dtoDetalleOfertaLaboralActivaAdministrador.getDireccionEmpresa()))")
    public abstract OfertaLaboral mapDtoAOfertaLaboral (DtoDetalleOfertaLaboralActivaAdministrador dtoDetalleOfertaLaboralActivaAdministrador);
}
