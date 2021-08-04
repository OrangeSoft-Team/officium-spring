package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.empleadorApp.habilidad.Habilidad;
import com.orangesoft.officium.empleadorApp.habilidad.dominio.valueObjects.IdHabilidad;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.EnumDuracionEstimada;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.EnumEstadoOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.EnumTurnoTrabajo;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertaLaboralActivaEmpleador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class,
        IdHabilidad.class, Habilidad.class, EnumTurnoTrabajo.class, EnumEstadoOfertaLaboral.class,OfertaLaboral.class, EnumDuracionEstimada.class
})
public abstract class MapeadorDtoOfertaLaboralActivaEmpleador {
    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacion().getFechaPublicacion())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldo().getSueldo())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(Integer.parseInt(ofertaLaboral.getDuracionEstimada().toString()))")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimada().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "estado", expression = "java(ofertaLaboral.getEstado().getEstado().toString())")
    public abstract DtoOfertaLaboralActivaEmpleador mapOfertaLaboraActivaADto(OfertaLaboral ofertaLaboral);


    @Mapping(target = "titulo", expression = "java(new Titulo(dtoOfertasLaboralesActivasEmpleador.getTitulo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(dtoOfertasLaboralesActivasEmpleador.getFechaPublicacion()))" )
    @Mapping(target = "cargo", expression = "java(new Cargo(dtoOfertasLaboralesActivasEmpleador.getCargo()))" )
    @Mapping(target = "sueldo", expression = "java(new Sueldo(dtoOfertasLaboralesActivasEmpleador.getSueldo()))")
    @Mapping(target = "duracionEstimada", expression ="java(new DuracionEstimada(dtoOfertasLaboralesActivasEmpleador.getDuracionEstimadaValor(),EnumDuracionEstimada.valueOf(dtoOfertasLaboralesActivasEmpleador.getDuracionEstimadaEscala())))" )
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(EnumTurnoTrabajo.valueOf(dtoOfertasLaboralesActivasEmpleador.getTurnoTrabajo().toString())))" )
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(dtoOfertasLaboralesActivasEmpleador.getNumeroVacantes()))")
    @Mapping(target = "estado", expression = "java(new Estado(EnumEstadoOfertaLaboral.valueOf(dtoOfertasLaboralesActivasEmpleador.getEstado().toString())))")
    public abstract OfertaLaboral mapDtoAOfertaLaboraActiva(DtoOfertaLaboralActivaEmpleador dtoOfertasLaboralesActivasEmpleador);

}
