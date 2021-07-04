package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersistenciaOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboralEmpleador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class, IdOfertaLaboral.class, IdEmpresa.class, IdPersistenciaOfertaLaboralEmpleador.class})
public abstract class MapeadorPersistenciaOfertaLaboralActivaEmpleador {

    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaOfertaLaboral.idPersistenciaOfertaLaboral.getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaOfertaLaboral.getIdPersistenciaOfertaLaboral().getUuid().toString()))")
    @Mapping(target = "titulo", expression = "java(new Titulo(persistenciaOfertaLaboral.getTitulo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(persistenciaOfertaLaboral.getFechaPublicacion()))")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(new FechaUltimaModificacion(persistenciaOfertaLaboral.fechaPublicacion))")
    @Mapping(target = "cargo", expression = "java(new Cargo(persistenciaOfertaLaboral.getCargo()))")
    @Mapping(target = "sueldo", expression = "java(new Sueldo(persistenciaOfertaLaboral.getSueldo()))")
    @Mapping(target = "descripcion", expression = "java(new Descripcion(persistenciaOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaValor", expression = "java(new DuracionEstimadaValor(Integer.valueOf(persistenciaOfertaLaboral.getDuracionEstimada())))")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(new DuracionEstimadaEscala(persistenciaOfertaLaboral.getDuracionEstimadaEscala().toString()))")
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(persistenciaOfertaLaboral.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(Integer.valueOf(persistenciaOfertaLaboral.getNumeroVacantes())))")
    @Mapping(target = "estado", expression = "java(new Estado(persistenciaOfertaLaboral.getEstado()))")
    public abstract OfertaLaboral persistenciaAOfertaLaboral(PersistenciaOfertaLaboralEmpleador persistenciaOfertaLaboral);

    @Mapping(target = "idPersistenciaOfertaLaboral", expression = "java(new com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersistenciaOfertaLaboralEmpleador(UUID.fromString(ofertaLaboral.getIdEmpresa().getIdEmpresa()),UUID.fromString(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())))")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacion().getFechaPublicacion())" )
    @Mapping(target = "fechaUltimaModificacion", expression = "java(ofertaLaboral.getFechaUltimaModificacion().getFechaUltimaPublicacion())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())" )
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "duracionEstimada", expression ="java(ofertaLaboral.getDuracionEstimadaValor().getDuracionEstimadaValor().toString())" )
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaEscala().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo())" )
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().getDescripcion())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstado().getEstado())")
    public abstract PersistenciaOfertaLaboralEmpleador ofertaLaboralAPersistencia(OfertaLaboral ofertaLaboral);
}

