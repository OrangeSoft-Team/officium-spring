package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.comun.persistencia.ofertaLaboral.IdPersistenciaOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdPais;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.Instant;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class,
        IdOfertaLaboral.class,
        IdEmpresa.class,
        IdPersistenciaOfertaLaboral.class,
        Instant.class,
        IdPais.class})
public abstract class MapeadorPersistenciaOfertaLaboralActivaEmpleador {

    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaOfertaLaboral.getIdPersistenciaOfertaLaboral().getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaOfertaLaboral.getIdPersistenciaOfertaLaboral().getUuid().toString()))")
    @Mapping(target = "titulo", expression = "java(new Titulo(persistenciaOfertaLaboral.getTitulo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(persistenciaOfertaLaboral.getFechaPublicacion().toString()))")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(new FechaUltimaModificacion(persistenciaOfertaLaboral.getFechaUltimaModificacion().toString()))")
    @Mapping(target = "cargo", expression = "java(new Cargo(persistenciaOfertaLaboral.getCargo()))")
    @Mapping(target = "sueldo", expression = "java(new Sueldo(persistenciaOfertaLaboral.getSueldo()))")
    @Mapping(target = "descripcion", expression = "java(new Descripcion(persistenciaOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaValor", expression = "java(new DuracionEstimadaValor(Integer.valueOf(persistenciaOfertaLaboral.getDuracionEstimada())))")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(new DuracionEstimadaEscala(persistenciaOfertaLaboral.getDuracionEstimadaEscala().toString()))")
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(persistenciaOfertaLaboral.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(Integer.valueOf(persistenciaOfertaLaboral.getNumeroVacantes())))")
    @Mapping(target = "estado", expression = "java(new Estado(persistenciaOfertaLaboral.getEstado()))")
    public abstract OfertaLaboral persistenciaAOfertaLaboral(PersistenciaOfertaLaboral persistenciaOfertaLaboral);

    @Mapping(target = "idPersistenciaOfertaLaboral", expression = "java(new com.orangesoft.officium.comun.persistencia.ofertaLaboral.IdPersistenciaOfertaLaboral(UUID.fromString(ofertaLaboral.getIdEmpresa().getIdEmpresa()), UUID.fromString(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())))")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(Instant.parse(ofertaLaboral.getFechaPublicacion().getFechaPublicacion()))" )
    @Mapping(target = "fechaUltimaModificacion", expression = "java(Instant.parse(ofertaLaboral.getFechaUltimaModificacion().getFechaUltimaPublicacion()))")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())" )
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "duracionEstimada", expression ="java(ofertaLaboral.getDuracionEstimadaValor().getDuracionEstimadaValor().toString())" )
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaEscala().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo())" )
    @Mapping(target = "numeroVacantes", expression = "java(Integer.parseInt(ofertaLaboral.getNumeroVacantes().toString()))")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().getDescripcion())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstado().getEstado())")
    public abstract PersistenciaOfertaLaboral ofertaLaboralAPersistencia(OfertaLaboral ofertaLaboral);
}

