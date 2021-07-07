package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;
import  java.time.Instant;

@Mapper(componentModel = "spring", imports = {UUID.class, IdOfertaLaboral.class, IdPersistenciaOfertaLaboral.class, Instant.class})
public abstract class MapeadorPersistenciaOfertaLaboralActiva {


    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaOfertaLaboral.getIdPersistenciaOfertaLaboral().getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaOfertaLaboral.getIdPersistenciaOfertaLaboral().getUuid().toString()))")
    @Mapping(target = "titulo", expression = "java(new Titulo(persistenciaOfertaLaboral.getTitulo()))")
    @Mapping(target = "cargo", expression = "java(new Cargo(persistenciaOfertaLaboral.getCargo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(persistenciaOfertaLaboral.getFechaPublicacion().toString()))")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(new FechaUltimaModificacion(persistenciaOfertaLaboral.getFechaUltimaModificacion().toString()))")
    @Mapping(target = "sueldo", expression = "java(new Sueldo(persistenciaOfertaLaboral.getSueldo()))")
    @Mapping(target = "descripcion", expression = "java(new Descripcion(persistenciaOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaValor", expression = "java(new DuracionEstimadaValor(Integer.parseInt(persistenciaOfertaLaboral.getDuracionEstimada())))")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(new DuracionEstimadaEscala(persistenciaOfertaLaboral.getDuracionEstimadaEscala()))")
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(persistenciaOfertaLaboral.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(persistenciaOfertaLaboral.getNumeroVacantes()))")
    @Mapping(target = "estado", expression = "java(new Estado(persistenciaOfertaLaboral.getEstado() ))")
    public abstract OfertaLaboral persistenciaAOfertaLaboral(PersistenciaOfertaLaboral persistenciaOfertaLaboral);

    @Mapping(target = "idPersistenciaOfertaLaboral", expression="java(new IdPersistenciaOfertaLaboral(UUID.fromString(ofertaLaboral.getIdEmpresa().getIdEmpresa()),UUID.fromString(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())))")
    @Mapping(target = "fechaPublicacion", expression = "java(Instant.parse(ofertaLaboral.getFechaPublicacion().getFechaPublicacion()))")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(Instant.parse(ofertaLaboral.getFechaUltimaModificacion().getFechaUltimaPublicacion()))")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "divisa", expression = "java(ofertaLaboral.getSueldo().toString())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().getDescripcion())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaEscala().toString())")
    //@Mapping(target = "duracionEstimada", expression = "java(Integer.toString(ofertaLaboral.getDuracionEstimada().getDuracionEstimada()))")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstado().getEstado())")
    public abstract PersistenciaOfertaLaboral ofertaLaboralAPersistencia(OfertaLaboral ofertaLaboral);
}

