package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.habilidad.Habilidad;
import com.orangesoft.officium.empleadorApp.habilidad.dominio.valueObjects.IdHabilidad;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.EnumDuracionEstimada;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.EnumEstadoOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.EnumTurnoTrabajo;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoConsultarDetallesOfertasLaboralesEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpleador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class,
        IdHabilidad.class, Habilidad.class, EnumTurnoTrabajo.class, EnumEstadoOfertaLaboral.class, OfertaLaboral.class, EnumDuracionEstimada.class

})
public abstract class MapeadorDtoCrearOfertasLaboralesEmpleador {
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTitulo().getTitulo())")
     @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargo().getCargo())")
    @Mapping(target = "sueldo", expression = "java(Integer.parseInt(ofertaLaboral.getSueldo().toString()))")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcion().toString())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(Integer.parseInt(ofertaLaboral.getDuracionEstimada().toString()))")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimada().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajo().getTurnoTrabajo().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "requisitosEspeciales", expression = "java(ofertaLaboral.getRequisitosEspeciales().toString())")
    @Mapping(target = "uuidHabilidad", expression = "java(ofertaLaboral.getHabilidads().toString())")
    @Mapping(target = "nombreHabilidad", expression = "java(ofertaLaboral.getHabilidads().toString())")
    @Mapping(target = "nombreCategoriaHabilidad", expression = "java(ofertaLaboral.getHabilidads().toString())")
    public abstract DtoCrearOfertaLaboralEmpleador mapCrearOfertaLaboralAdto(Empresa empresa, OfertaLaboral ofertaLaboral);


    @Mapping(target = "titulo", expression = "java(new Titulo(dtoOfertasLaboralesConsultarDetallesEmpleador.getTitulo()))")
    @Mapping(target = "fechaPublicacion", expression = "java(new FechaPublicacion(dtoOfertasLaboralesConsultarDetallesEmpleador.getFechaPublicacion()))" )
    @Mapping(target = "cargo", expression = "java(new Cargo(dtoOfertasLaboralesConsultarDetallesEmpleador.getCargo()))" )
    @Mapping(target = "sueldo", expression = "java(new Sueldo(dtoOfertasLaboralesConsultarDetallesEmpleador.getSueldo()))")
    @Mapping(target = "duracionEstimada", expression ="java(new DuracionEstimada(dtoOfertasLaboralesConsultarDetallesEmpleador.getDuracionEstimadaValor(),EnumDuracionEstimada.valueOf(dtoOfertasLaboralesConsultarDetallesEmpleador.getDuracionEstimadaEscala())))" )
    @Mapping(target = "turnoTrabajo", expression = "java(new TurnoTrabajo(EnumTurnoTrabajo.valueOf(dtoOfertasLaboralesConsultarDetallesEmpleador.getTurnoTrabajo().toString())))" )
    @Mapping(target = "numeroVacantes", expression = "java(new NumeroVacantes(dtoOfertasLaboralesConsultarDetallesEmpleador.getNumeroVacantes()))")
    @Mapping(target = "requisitosEspeciales", expression = "java(new RequisitosEspeciales(dtoOfertasLaboralesConsultarDetallesEmpleador.getRequisitosEspeciales()))")
    @Mapping(target = "estado", expression = "java(new Estado(EnumEstadoOfertaLaboral.valueOf(dtoOfertasLaboralesConsultarDetallesEmpleador.getEstado().toString())))")
    //@Mapping(target = "habilidads", expression = "java(new Habilidad(dtoOfertasLaboralesConsultarDetallesEmpleador.getNombreHabilidad()))")
    public abstract OfertaLaboral mapDtoAOfertaLaboral(DtoConsultarDetallesOfertasLaboralesEmpleador dtoOfertasLaboralesConsultarDetallesEmpleador);

}
