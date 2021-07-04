package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoDetalleOfertaLaboralAdministrador;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

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
public abstract class MapeadorQDtoDetalleOfertaLaboralAdministrador {
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(qDtoDetalleOfertaLaboral.getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoDetalleOfertaLaboral.getUuid().toString()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoDetalleOfertaLaboral.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoDetalleOfertaLaboral.getCargo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoDetalleOfertaLaboral.getFechaPublicacion()  )  ))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoDetalleOfertaLaboral.getFechaUltimaModificacion()  )  ))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(qDtoDetalleOfertaLaboral.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(qDtoDetalleOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(Integer.parseInt(qDtoDetalleOfertaLaboral.getDuracionEstimada()), PeriodoTiempo.obtenerPeriodoTiempo(qDtoDetalleOfertaLaboral.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(qDtoDetalleOfertaLaboral.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(qDtoDetalleOfertaLaboral.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral( EnumEstadoOfertaLaboral.PUBLICADA ))")
    @Mapping(target = "idCiudadOfertaLaboral", expression = "java(new IdCiudad(qDtoDetalleOfertaLaboral.getCiudad()))")
    @Mapping(target = "nombreEmpresaOfertaLaboral", expression = "java(new NombreEmpresa(qDtoDetalleOfertaLaboral.getNombreEmpresa()))")
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(QDtoDetalleOfertaLaboralAdministrador qDtoDetalleOfertaLaboral);
}
