package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.comun.persistencia.ofertaLaboral.IdPersistenciaOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.EnumEstadoOfertaLaboral;

@Mapper(componentModel = "spring", imports = {
        IdPersistenciaOfertaLaboral.class,
        UUID.class,
        Instant.class,
        EnumEstadoOfertaLaboral.class,
        LocalDate.class,
        ZoneId.class
})
public abstract class MapeadorOfertaLaboralPersistenciaAdministrador {
    @Mapping(target = "idPersistenciaOfertaLaboral", expression = "java(new IdPersistenciaOfertaLaboral(UUID.fromString(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa()), UUID.fromString(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())))")
    @Mapping(target = "fechaPublicacion", expression = "java( LocalDate.parse(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaOfertaLaboral()).atStartOfDay(ZoneId.of(\"Europe/Paris\")).toInstant() )")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(  LocalDate.parse( ofertaLaboral.getFechaUltimaModificacionOfertaLaboral().getFechaOfertaLaboral() ).atStartOfDay(ZoneId.of(\"Europe/Paris\")).toInstant() )")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldoOfertaLaboral())")
    @Mapping(target = "divisa", expression = "java(\"USD\")")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcionOfertaLaboral())")
    @Mapping(target = "duracionEstimada", expression = "java(String.valueOf(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral()))")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstadoOfertaLaboral().getEstadoOfertaLaboral().toChar())")
    public abstract PersistenciaOfertaLaboral ofertaLaboralAPersistencia(OfertaLaboral ofertaLaboral);
}
