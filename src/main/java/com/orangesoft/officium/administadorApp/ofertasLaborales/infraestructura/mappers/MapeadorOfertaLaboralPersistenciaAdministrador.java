package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        Instant.class,
        EnumEstatusOfertaLaboral.class,
        LocalDate.class,
        ZoneId.class
})
public abstract class MapeadorOfertaLaboralPersistenciaAdministrador {
    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())")
    @Mapping(target = "fechaPublicacion", expression = "java( LocalDate.parse(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaOfertaLaboral()).atStartOfDay(ZoneId.of(\"Europe/Paris\")).toInstant() )")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(  LocalDate.parse( ofertaLaboral.getFechaUltimaModificacionOfertaLaboral().getFechaOfertaLaboral() ).atStartOfDay(ZoneId.of(\"Europe/Paris\")).toInstant() )")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "fechaLimite", expression = "java( LocalDate.parse(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaOfertaLaboral()).atStartOfDay(ZoneId.of(\"Europe/Paris\")).toInstant() )")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcionOfertaLaboral())")
    @Mapping(target = "valorDuracion", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral())")
    @Mapping(target = "escalaDuracion", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
    @Mapping(target = "estatus", expression = "java(ofertaLaboral.getEstadoOfertaLaboral().getEstadoOfertaLaboral().toString())")
    @Mapping(target = "uuidEmpresa", expression = "java(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa())")
    @Mapping(target = "requisitosEspeciales", expression = "java(ofertaLaboral.getRequisitosEspecialesOfertaLaboral().getRequisitosEspeciales())")
    public abstract PersistenciaOfertaLaboral ofertaLaboralAPersistencia(OfertaLaboral ofertaLaboral);
}
