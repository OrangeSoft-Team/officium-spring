package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.direccion.Direccion;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.habilidad.Habilidad;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.empleadorApp.postulacionOfertaLaboral.PostulacionOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.Instant;
import java.util.UUID;
import  java.time.Instant;

@Mapper(componentModel = "spring", imports = {UUID.class,
        IdOfertaLaboral.class,
        IdEmpresa.class,
        Instant.class,
        PostulacionOfertaLaboral.class,
        Habilidad.class,
        Direccion.class,
        RequisitosEspeciales.class,
        DuracionEstimada.class,
        EnumEstadoOfertaLaboral.class,
        EnumTurnoTrabajo.class,
        EnumDuracionEstimada.class
})
public abstract class MapeadorPersistenciaOfertaLaboralEmpleador {
    @Mapping(target = "uuid", expression = "java(UUID.fromString(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral()))")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(Instant.parse(ofertaLaboral.getFechaPublicacion().getFechaPublicacion()))")
    @Mapping(target = "fechaLimite", expression = "java(Instant.parse(ofertaLaboral.getFechaLimitePostulacion().toString()))")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().getDescripcion())")
    @Mapping(target = "valorDuracion", expression = "java(Integer.parseInt(ofertaLaboral.getDuracionEstimada().toString()))")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo().toString())")
    @Mapping(target = "escalaDuracion", expression = "java(ofertaLaboral.getDuracionEstimada().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "estatus", expression = "java(ofertaLaboral.getEstado().getEstado().toString())")
    @Mapping(target = "uuidEmpresa", expression = "java(UUID.fromString(ofertaLaboral.getIdEmpresa().getIdEmpresa()))")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(Instant.parse(ofertaLaboral.getFechaUltimaModificacion().getFechaUltimaPublicacion()))")
    @Mapping(target = "requisitosEspeciales", expression = "java(ofertaLaboral.getRequisitosEspeciales().toString())")
    public abstract PersistenciaOfertaLaboral ofertaLaboralApersistencia(OfertaLaboral ofertaLaboral);


    @Mapping(target = "idEmpresa", expression="java(new IdEmpresa(persistenciaOfertaLaboral.getUuidEmpresa().toString()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(persistenciaOfertaLaboral.getUuid().toString()))")
    @Mapping(target = "titulo", expression = "java(new Titulo(persistenciaOfertaLaboral.getTitulo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(persistenciaOfertaLaboral.getFechaPublicacion().toString()))")
    @Mapping(target = "fechaLimitePostulacion", expression = "java(new FechaLimitePostulacion(persistenciaOfertaLaboral.getFechaLimite().toString()))")
    @Mapping(target = "fechaUltimaModificacion", expression = "java(new FechaUltimaModificacion(persistenciaOfertaLaboral.getFechaUltimaModificacion().toString()))")
    @Mapping(target = "cargo", expression = "java(new Cargo(persistenciaOfertaLaboral.getCargo()))")
    @Mapping(target = "sueldo", expression = "java(new Sueldo(persistenciaOfertaLaboral.getSueldo()))")
    @Mapping(target = "descripcion", expression = "java( new Descripcion(persistenciaOfertaLaboral.getDescripcion()))")
    @Mapping(target = "duracionEstimada", expression = "java(new DuracionEstimada(persistenciaOfertaLaboral.getValorDuracion(),EnumDuracionEstimada.valueOf(persistenciaOfertaLaboral.getEscalaDuracion())))" )
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(EnumTurnoTrabajo.valueOf(persistenciaOfertaLaboral.getTurnoTrabajo().toString())))")
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(persistenciaOfertaLaboral.getNumeroVacantes()))" )
    @Mapping(target = "requisitosEspeciales", expression = "java(new RequisitosEspeciales(persistenciaOfertaLaboral.getRequisitosEspeciales()))")
    @Mapping(target = "estado", expression ="java(new Estado(EnumEstadoOfertaLaboral.valueOf(persistenciaOfertaLaboral.getEstatus())))" )
    public abstract OfertaLaboral persistenciaOfertaLaboral(PersistenciaOfertaLaboral persistenciaOfertaLaboral);
}
