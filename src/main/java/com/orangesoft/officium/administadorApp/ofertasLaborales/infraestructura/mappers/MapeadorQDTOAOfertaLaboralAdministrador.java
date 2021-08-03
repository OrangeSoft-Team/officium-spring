package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivasAdministrador;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import org.springframework.stereotype.Component;

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
        IdCiudad.class,
        NombreEmpresa.class,
        EnumEscalaDuracionOfertaLaboral.class,
        DateTimeFormatter.class,
        ZoneId.class,
        RequisitosEspecialesOfertaLaboral.class,
        EnumTurnoOfertaLaboral.class})
public abstract class MapeadorQDTOAOfertaLaboralAdministrador {
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(qDtoOfertasLaboralesActivas.getUuidEmpresa()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoOfertasLaboralesActivas.getUuid()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoOfertasLaboralesActivas.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoOfertasLaboralesActivas.getCargo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoOfertasLaboralesActivas.getFechaPublicacion()  )  ))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral(  DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  qDtoOfertasLaboralesActivas.getFechaUltimaModificacion()  )  ))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(qDtoOfertasLaboralesActivas.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(qDtoOfertasLaboralesActivas.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(qDtoOfertasLaboralesActivas.getDuracionEstimada(), EnumEscalaDuracionOfertaLaboral.valueOf(qDtoOfertasLaboralesActivas.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.valueOf(qDtoOfertasLaboralesActivas.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(qDtoOfertasLaboralesActivas.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(EnumEstatusOfertaLaboral.valueOf(qDtoOfertasLaboralesActivas.getEstatus())))")
    @Mapping(target = "requisitosEspecialesOfertaLaboral", expression = "java(new RequisitosEspecialesOfertaLaboral(qDtoOfertasLaboralesActivas.getRequisitosEspeciales()))")
    //@Mapping(target = "idCiudadOfertaLaboral", expression = "java(new IdCiudad(qDtoOfertasLaboralesActivas.getCiudad()))")
    @Mapping(target = "nombreEmpresaOfertaLaboral", expression = "java(new NombreEmpresa(qDtoOfertasLaboralesActivas.getNombreEmpresa()))")
    // Lista de habilidades que es asiganada en el servicio
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(QDtoOfertasLaboralesActivasAdministrador qDtoOfertasLaboralesActivas);
}
