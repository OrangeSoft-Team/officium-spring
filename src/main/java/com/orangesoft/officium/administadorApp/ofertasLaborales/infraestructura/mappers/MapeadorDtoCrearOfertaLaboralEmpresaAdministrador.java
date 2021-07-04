package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpresaAdministrador;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        PeriodoTiempo.class,
        DateTimeFormatter.class,
        LocalDateTime.class,
        EnumEstadoOfertaLaboral.class,
        IdOfertaLaboral.class,
        IdEmpresa.class,
        TituloOfertaLaboral.class,
        FechaOfertaLaboral.class,
        CargoOfertaLaboral.class,
        SueldoOfertaLaboral.class,
        DescripcionOfertaLaboral.class,
        DuracionEstimadaOfertaLaboral.class,
        TurnoTrabajoOfertaLaboral.class,
        NumeroVacantesOfertaLaboral.class,
        EstadoOfertaLaboral.class,
        ZoneId.class
    })
public abstract class MapeadorDtoCrearOfertaLaboralEmpresaAdministrador {
    @Mapping(target = "uuidEmpresa", expression = "java(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldoOfertaLaboral())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcionOfertaLaboral())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
    public abstract DtoCrearOfertaLaboralEmpresaAdministrador mapOfertaLaboralADto(OfertaLaboral ofertaLaboral);

    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(UUID.randomUUID().toString()))")
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(dtoCrearOfertaLaboralEmpresaAdministrador.getUuidEmpresa()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getTitulo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral( DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  LocalDateTime.now()  ) ))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral( DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  LocalDateTime.now()  ) ))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getDuracionEstimadaValor(), PeriodoTiempo.obtenerPeriodoTiempo(dtoCrearOfertaLaboralEmpresaAdministrador.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(EnumEstadoOfertaLaboral.PUBLICADA))")
    public abstract OfertaLaboral mapDtoAOfertaLaboral (DtoCrearOfertaLaboralEmpresaAdministrador dtoCrearOfertaLaboralEmpresaAdministrador);
}
