package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", imports = {
        UUID.class,
        IdEmpresa.class,
        IdOfertaLaboral.class,
        TituloOfertaLaboral.class,
        CargoOfertaLaboral.class,
        FechaOfertaLaboral.class,
        EnumEstadoOfertaLaboral.class,
        SueldoOfertaLaboral.class,
        DescripcionOfertaLaboral.class,
        DuracionEstimadaOfertaLaboral.class,
        TurnoTrabajoOfertaLaboral.class,
        NumeroVacantesOfertaLaboral.class,
        EstadoOfertaLaboral.class,
        IdCiudad.class,
        NombreEmpresa.class,
        PeriodoTiempo.class,
        DateTimeFormatter.class,
        ZoneId.class})
public abstract class MapeadorQDTOAOfertaLaboral {
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(qDtoOfertasLaboralesActivas.getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoOfertasLaboralesActivas.getUuid().toString()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoOfertasLaboralesActivas.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoOfertasLaboralesActivas.getCargo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoOfertasLaboralesActivas.getFechaPublicacion()  )  ))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoOfertasLaboralesActivas.getFechaUltimaModificacion()  )  ))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(qDtoOfertasLaboralesActivas.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(qDtoOfertasLaboralesActivas.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(Integer.parseInt(qDtoOfertasLaboralesActivas.getDuracionEstimada()), PeriodoTiempo.obtenerPeriodoTiempo(qDtoOfertasLaboralesActivas.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(qDtoOfertasLaboralesActivas.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(qDtoOfertasLaboralesActivas.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(qDtoOfertasLaboralesActivas.getEstado() == 'P'? EnumEstadoOfertaLaboral.PUBLICADA: EnumEstadoOfertaLaboral.CANCELADA))")
    //@Mapping(target = "idCiudadOfertaLaboral", expression = "java(new IdCiudad(qDtoOfertasLaboralesActivas.getCiudad()))")
    @Mapping(target = "nombreEmpresaOfertaLaboral", expression = "java(new NombreEmpresa(qDtoOfertasLaboralesActivas.getNombreEmpresa()))")
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(QDtoOfertasLaboralesActivas qDtoOfertasLaboralesActivas);
}
