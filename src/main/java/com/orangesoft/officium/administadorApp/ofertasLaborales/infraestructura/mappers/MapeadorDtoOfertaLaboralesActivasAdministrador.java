package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasAdministrador;

@Component
@Mapper(componentModel = "spring", imports = {EnumEscalaDuracionOfertaLaboral.class})
public abstract class MapeadorDtoOfertaLaboralesActivasAdministrador {
    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral().toString())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaOfertaLaboral())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldoOfertaLaboral())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
    @Mapping(target = "empresaNombre", expression = "java(ofertaLaboral.getNombreEmpresaOfertaLaboral().getNombreEmpresa())")
    @Mapping(target = "estatus", expression = "java(ofertaLaboral.getEstadoOfertaLaboral().getEstadoOfertaLaboral().toString())")
    public abstract DtoOfertasLaboralesActivasAdministrador mapOfertaLaboralADto(OfertaLaboral ofertaLaboral);

//    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getUuid()))")
//    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getTitulo()))")
//    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getFechaPublicacion()))")
//    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getCargo()))")
//    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getSueldo()))")
//    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getDuracionEstimadaValor(), EnumEscalaDuracionOfertaLaboral.valueOf(dtoOfertasLaboralesActivasAdministrador.getDuracionEstimadaEscala())))")
//    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getTurnoTrabajo()))")
//    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getNumeroVacantes()))")
//    @Mapping(target = "nombreEmpresaOfertaLaboral", expression = "java(new NombreEmpresa(dtoOfertasLaboralesActivasAdministrador.getEmpresaNombre()))")
//    public abstract OfertaLaboral mapDtoAOfertaLaboral (DtoOfertasLaboralesActivasAdministrador dtoOfertasLaboralesActivasAdministrador);
}
