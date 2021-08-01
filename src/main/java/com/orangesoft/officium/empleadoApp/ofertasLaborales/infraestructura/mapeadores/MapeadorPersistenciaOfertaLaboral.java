package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
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
        EnumTurnoOfertaLaboral.class
})
public abstract class MapeadorPersistenciaOfertaLaboral {

    @Mapping(target = "postulacionesOfertaLaboral", ignore = true)
    @Mapping(target = "habilidades", ignore = true)
    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaOfertaLaboral.getUuidEmpresa()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaOfertaLaboral.getUuidEmpresa()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(persistenciaOfertaLaboral.getTitulo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaPublicacionOfertaLaboral(persistenciaOfertaLaboral.getFechaPublicacion(), persistenciaOfertaLaboral.getFechaUltimaModificacion(), persistenciaOfertaLaboral.getFechaLimite()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(persistenciaOfertaLaboral.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(persistenciaOfertaLaboral.getSueldo(), com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda.USD))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(persistenciaOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(persistenciaOfertaLaboral.getValorDuracion(), EnumEscalaDuracionOfertaLaboral.valueOf(persistenciaOfertaLaboral.getEscalaDuracion())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.valueOf(persistenciaOfertaLaboral.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(persistenciaOfertaLaboral.getNumeroVacantes()))")
    @Mapping(target = "requisitosEspecialesOfertaLaboral", expression = "java(new RequisitosEspecialesOfertaLaboral(persistenciaOfertaLaboral.getRequisitosEspeciales()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(EnumEstatusOfertaLaboral.valueOf(persistenciaOfertaLaboral.getEstatus())))")
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(PersistenciaOfertaLaboral persistenciaOfertaLaboral);

}
