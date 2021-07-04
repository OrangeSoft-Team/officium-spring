package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class, IdOfertaLaboral.class})
public abstract class MapeadorPersistenciaOfertaLaboralActiva {

    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaOfertaLaboral.getUuid().toString()))")
    @Mapping(target = "titulo", expression = "java(new Titulo(persistenciaOfertaLaboral.getTitulo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(persistenciaOfertaLaboral.getFechaPublicacion()))")
    @Mapping(target = "cargo", expression = "java(new Cargo(persistenciaOfertaLaboral.getCargo()))")
    @Mapping(target = "sueldo", expression = "java(new Sueldo(persistenciaOfertaLaboral.getSueldo()))")
    @Mapping(target = "descripcion", expression = "java(new Descripcion(persistenciaOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimadaValor", expression = "java(new DuracionEstimadaValor(Integer.valueOf(persistenciaOfertaLaboral.getDuracionEstimadaValor())))")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(new DuracionEstimadaEscala(persistenciaOfertaLaboral.getDuracionEstimadaEscala().toString()))")
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(persistenciaOfertaLaboral.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(Integer.valueOf(persistenciaOfertaLaboral.getNumeroVacantes())))")
    @Mapping(target = "estado", expression = "java(new Estado(persistenciaOfertaLaboral.getEstado()))")
    public abstract OfertaLaboral persistenciaAOfertaLaboral(PersistenciaOfertaLaboral persistenciaOfertaLaboral);

    @Mapping(target = "uuid", expression = "java(UUID.fromString(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral() ))")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacion().getFechaPublicacion())" )
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())" )
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "duracionEstimadaValor", expression ="java(ofertaLaboral.getDuracionEstimadaValor().getDuracionEstimadaValor().toString())" )
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaEscala().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo())" )
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().toString())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().getDescripcion())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstado().getEstado())")
    public abstract PersistenciaOfertaLaboral ofertaLaboralAPersistencia(OfertaLaboral ofertaLaboral);
}

