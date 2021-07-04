package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.escalaTiempo.dominio.EnumEscalaTiempo;
import com.orangesoft.officium.empleadoApp.estadoOfertaLaboral.dominio.EnumEstadoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.turnoTrabajo.dominio.EnumTurnoTrabajo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        IdEmpresa.class,
        IdOfertaLaboral.class,
        TituloOfertaLaboral.class,
        CargoOfertaLaboral.class,
        FechaPublicacionOfertaLaboral.class,
        EnumEstadoOfertaLaboral.class,
        SueldoOfertaLaboral.class,
        DescripcionOfertaLaboral.class,
        DuracionEstimadaOfertaLaboral.class,
        TurnoTrabajoOfertaLaboral.class,
        NumeroVacantes.class,
        EstadoOfertaLaboral.class,
        EnumMoneda.class, EnumTurnoTrabajo.class,
        EnumEscalaTiempo.class})
public abstract class MapeadorQDTOAOfertaLaboral {
    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(qDtoOfertasLaboralesActivas.getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoOfertasLaboralesActivas.getUuid().toString()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoOfertasLaboralesActivas.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoOfertasLaboralesActivas.getCargo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaPublicacionOfertaLaboral(qDtoOfertasLaboralesActivas.getFechaPublicacion(), qDtoOfertasLaboralesActivas.getFechaUltimaModificacion()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(qDtoOfertasLaboralesActivas.getSueldo(), com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda.USD))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(qDtoOfertasLaboralesActivas.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(Integer.parseInt(qDtoOfertasLaboralesActivas.getDuracionEstimada()), EnumEscalaTiempo.valueOf(qDtoOfertasLaboralesActivas.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoTrabajo.valueOf(qDtoOfertasLaboralesActivas.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(qDtoOfertasLaboralesActivas.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(qDtoOfertasLaboralesActivas.getEstado() == 'P'? EnumEstadoOfertaLaboral.PUBLICADA: EnumEstadoOfertaLaboral.CANCELADA))")
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(QDtoOfertasLaboralesActivas qDtoOfertasLaboralesActivas);
}
