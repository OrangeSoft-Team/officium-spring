package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpresaAdministrador;

@Mapper(componentModel = "spring")
public abstract class MapeadorDtoCrearOfertaLaboralEmpresaAdministrador {
    @Mapping(target = "uuidEmpresa", expression = "java(ofertaLaboral.getIdEmpresaOfertaLaboral().getIdEmpresa())")
    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldoOfertaLaboral())")
    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcionOfertaLaboral())")
    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral())")
    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral())")
    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
    public abstract DtoCrearOfertaLaboralEmpresaAdministrador mapOfertaLaboralADto(OfertaLaboral ofertaLaboral);

    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(dtoOfertasLaboralesActivasAdministrador.getUuidEmpresa()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getDuracionEstimadaValor(), dtoOfertasLaboralesActivasAdministrador.getDuracionEstimadaEscala()))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(dtoOfertasLaboralesActivasAdministrador.getNumeroVacantes()))")
    public abstract OfertaLaboral mapDtoAOfertaLaboral (DtoCrearOfertaLaboralEmpresaAdministrador dtoDetalleOfertaLaboralActivaAdministrador);
}
