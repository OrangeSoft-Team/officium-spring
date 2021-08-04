package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoDetalleOfertaLaboralAdministrador;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdDireccion;
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
        EnumEstatusOfertaLaboral.class,
        SueldoOfertaLaboral.class,
        DescripcionOfertaLaboral.class,
        DuracionEstimadaOfertaLaboral.class,
        TurnoTrabajoOfertaLaboral.class,
        NumeroVacantesOfertaLaboral.class,
        EstadoOfertaLaboral.class,
        IdDireccion.class,
        NombreEmpresa.class,
        EnumEscalaDuracionOfertaLaboral.class,
        DateTimeFormatter.class,
        ZoneId.class,
        RequisitosEspecialesOfertaLaboral.class,
        EnumTurnoOfertaLaboral.class})
public abstract class MapeadorQDtoDetalleOfertaLaboralAdministrador {
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(qDtoDetalleOfertaLaboral.getUuidEmpresa()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoDetalleOfertaLaboral.getUuid()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoDetalleOfertaLaboral.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoDetalleOfertaLaboral.getCargo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoDetalleOfertaLaboral.getFechaPublicacion()  )  ))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoDetalleOfertaLaboral.getFechaUltimaModificacion()  )  ))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(qDtoDetalleOfertaLaboral.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(qDtoDetalleOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(qDtoDetalleOfertaLaboral.getDuracionEstimada(), EnumEscalaDuracionOfertaLaboral.valueOf(qDtoDetalleOfertaLaboral.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.valueOf(qDtoDetalleOfertaLaboral.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(qDtoDetalleOfertaLaboral.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral( EnumEstatusOfertaLaboral.PUBLICADO ))")
    //@Mapping(target = "idCiudadOfertaLaboral", expression = "java(new IdDireccion(qDtoDetalleOfertaLaboral.getDireccion()))")
    @Mapping(target = "nombreEmpresaOfertaLaboral", expression = "java(new NombreEmpresa(qDtoDetalleOfertaLaboral.getNombreEmpresa()))")
    @Mapping(target = "requisitosEspecialesOfertaLaboral", expression = "java(new RequisitosEspecialesOfertaLaboral(qDtoDetalleOfertaLaboral.getRequisitosEspeciales()))")
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(QDtoDetalleOfertaLaboralAdministrador qDtoDetalleOfertaLaboral);
}
