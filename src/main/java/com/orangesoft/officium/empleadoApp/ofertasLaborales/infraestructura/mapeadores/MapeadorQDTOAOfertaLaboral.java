package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        IdEmpresa.class,
        IdOfertaLaboral.class,
        TituloOfertaLaboral.class,
        FechaPublicacionOfertaLaboral.class,
        CargoOfertaLaboral.class,
        SueldoOfertaLaboral.class,
        DescripcionOfertaLaboral.class,
        DuracionEstimadaOfertaLaboral.class,
        TurnoTrabajoOfertaLaboral.class,
        NumeroVacantes.class,
        RequisitosEspecialesOfertaLaboral.class,
        EstadoOfertaLaboral.class,
        EnumEscalaDuracionOfertaLaboral.class,
        EnumEstatusOfertaLaboral.class,
        EnumTurnoOfertaLaboral.class,
        EnumEscalaDuracionOfertaLaboral.class
})
public abstract class MapeadorQDTOAOfertaLaboral {
    private IdEmpresa idEmpresa;
    private IdOfertaLaboral idOfertaLaboral;
    private TituloOfertaLaboral tituloOfertaLaboral;
    private FechaPublicacionOfertaLaboral fechaPublicacionOfertaLaboral;
    private CargoOfertaLaboral cargoOfertaLaboral;
    private SueldoOfertaLaboral sueldoOfertaLaboral;
    private DescripcionOfertaLaboral descripcionOfertaLaboral;
    private DuracionEstimadaOfertaLaboral duracionEstimadaOfertaLaboral;
    private TurnoTrabajoOfertaLaboral turnoTrabajoOfertaLaboral;
    private NumeroVacantes numeroVacantes;
    private RequisitosEspecialesOfertaLaboral requisitosEspecialesOfertaLaboral;
    private EstadoOfertaLaboral estadoOfertaLaboral;

    @Mapping(target = "postulacionesOfertaLaboral", ignore = true)
    @Mapping(target = "habilidades", ignore = true)
    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(qDtoOfertasLaboralesActivas.getUuidEmpresa()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoOfertasLaboralesActivas.getUuid()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoOfertasLaboralesActivas.getTitulo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaPublicacionOfertaLaboral(qDtoOfertasLaboralesActivas.getFechaPublicacion(), qDtoOfertasLaboralesActivas.getFechaUltimaModificacion(), qDtoOfertasLaboralesActivas.getFechaLimiteAplicacion()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoOfertasLaboralesActivas.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(qDtoOfertasLaboralesActivas.getSueldo(), com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda.USD))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(qDtoOfertasLaboralesActivas.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(qDtoOfertasLaboralesActivas.getDuracionEstimada(), EnumEscalaDuracionOfertaLaboral.valueOf(qDtoOfertasLaboralesActivas.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.valueOf(qDtoOfertasLaboralesActivas.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(qDtoOfertasLaboralesActivas.getNumeroVacantes()))")
    @Mapping(target = "requisitosEspecialesOfertaLaboral", expression = "java(new RequisitosEspecialesOfertaLaboral(qDtoOfertasLaboralesActivas.getRequisitosEspeciales()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(EnumEstatusOfertaLaboral.valueOf(qDtoOfertasLaboralesActivas.getEstatus())))")
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(QDtoOfertasLaboralesActivas qDtoOfertasLaboralesActivas);
}
