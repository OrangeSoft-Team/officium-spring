package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.empleadoApp.escalaTiempo.dominio.EnumEscalaTiempo;
import com.orangesoft.officium.empleadoApp.estadoOfertaLaboral.dominio.EnumEstadoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.turnoTrabajo.dominio.EnumTurnoTrabajo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class, IdPersistenciaOfertaLaboral.class, EnumEstadoOfertaLaboral.class, EnumMoneda.class, EnumTurnoTrabajo.class, EnumEscalaTiempo.class})
public abstract class MapeadorPersistenciaAOfertaLaboral {

    @Mapping(target = "idPersistenciaOfertaLaboral", expression="java(new IdPersistenciaOfertaLaboral(UUID.fromString(ofertaLaboral.getIdEmpresa().getIdEmpresa()),UUID.fromString(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())))")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaPublicacion())")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaUltimaModificacion())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTitulo())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldo())")
    @Mapping(target = "divisa", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getMoneda().toString())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcion())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getEscalaTiempo().toString())")
    @Mapping(target = "duracionEstimada", expression = "java(Integer.toString(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimada()))")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajo().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstadoOfertaLaboral().getEstadoOfertaLaboral().equals(EnumEstadoOfertaLaboral.PUBLICADA)? 'P': 'C')")
    public abstract PersistenciaOfertaLaboral OfertaLaboralAPersistencia(OfertaLaboral ofertaLaboral);

    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaOfertaLaboral.getIdPersistenciaOfertaLaboral().getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaOfertaLaboral.getIdPersistenciaOfertaLaboral().getUuid().toString()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(persistenciaOfertaLaboral.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(persistenciaOfertaLaboral.getCargo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaPublicacionOfertaLaboral(persistenciaOfertaLaboral.getFechaPublicacion(), persistenciaOfertaLaboral.getFechaUltimaModificacion()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(persistenciaOfertaLaboral.getSueldo(), com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda.USD))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(persistenciaOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(Integer.parseInt(persistenciaOfertaLaboral.getDuracionEstimada()), EnumEscalaTiempo.valueOf(persistenciaOfertaLaboral.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoTrabajo.valueOf(persistenciaOfertaLaboral.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(persistenciaOfertaLaboral.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(persistenciaOfertaLaboral.getEstado() == 'P'? EnumEstadoOfertaLaboral.PUBLICADA: EnumEstadoOfertaLaboral.CANCELADA))")
    public abstract OfertaLaboral PersistenciaAOfertaLaboral(PersistenciaOfertaLaboral persistenciaOfertaLaboral);

}
