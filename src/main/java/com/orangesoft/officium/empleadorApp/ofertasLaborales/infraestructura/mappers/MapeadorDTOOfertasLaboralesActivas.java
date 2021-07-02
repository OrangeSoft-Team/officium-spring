package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class})
public abstract class MapeadorDTOOfertasLaboralesActivas {

    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacion().getFechaPublicacion())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaValor().getDuracionEstimadaValor())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaEscala().getDuracionEstimadaEscala())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().getDescripcion())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstado().getEstado())")
    public abstract DtoOfertasLaboralesActivasEmpresa mapOfertaLaboraActivaADto(OfertaLaboral ofertaLaboral);


    @Mapping(target = "titulo", expression = "java(new Titulo(dtoOfertasLaboralesActivasEmpresa.getTitulo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(dtoOfertasLaboralesActivasEmpresa.getFechaPublicacion()))" )
    @Mapping(target = "cargo", expression = "java(new Cargo(dtoOfertasLaboralesActivasEmpresa.getCargo()))" )
    @Mapping(target = "sueldo", expression = "java(new Sueldo(dtoOfertasLaboralesActivasEmpresa.getSueldo()))")
    @Mapping(target = "duracionEstimadaValor", expression ="java(new DuracionEstimadaValor(dtoOfertasLaboralesActivasEmpresa.getDuracionEstimadaValor()))" )
    @Mapping(target = "duracionEstimadaEscala", expression = "java(new DuracionEstimadaEscala(dtoOfertasLaboralesActivasEmpresa.getDuracionEstimadaEscala()))")
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(dtoOfertasLaboralesActivasEmpresa.getTurnoTrabajo()))" )
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(dtoOfertasLaboralesActivasEmpresa.getNumeroVacantes()))")
    @Mapping(target = "descripcion", expression = "java(new Descripcion(dtoOfertasLaboralesActivasEmpresa.getDescripcion()))")
    @Mapping(target = "estado", expression = "java(new Estado(dtoOfertasLaboralesActivasEmpresa.getEstado()))")
    public abstract OfertaLaboral mapDtoAOfertaLaboraActiva(DtoOfertasLaboralesActivasEmpresa dtoOfertasLaboralesActivasEmpresa);
}
