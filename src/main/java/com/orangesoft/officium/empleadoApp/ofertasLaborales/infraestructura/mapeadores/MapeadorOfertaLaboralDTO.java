package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class, EnumMoneda.class

})
public abstract class MapeadorOfertaLaboralDTO {
    @Mapping(target = "uuid", expression = "java(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral().toString())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTitulo())")
    @Mapping(target = "fechaPublicacion", expression = "java(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaPublicacion().toString())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargo())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldo())")
    @Mapping(target = "divisa", expression = "java(com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda.USD.toString())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimada())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getEscalaTiempo().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajo().toString())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantes().getNumeroVacantes())")
    @Mapping(target = "empresaNombre", expression = "java(nombreEmpresa.getNombreEmpresa())")
    public abstract DtoOfertasLaboralesActivasEmpleado mapOfertaLaboralADto(NombreEmpresa nombreEmpresa,OfertaLaboral ofertaLaboral);
}
