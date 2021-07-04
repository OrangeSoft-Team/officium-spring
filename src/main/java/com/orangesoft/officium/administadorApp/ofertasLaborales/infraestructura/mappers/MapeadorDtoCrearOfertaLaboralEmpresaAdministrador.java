package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.PeriodoTiempo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpresaAdministrador;

@Mapper(componentModel = "spring", imports = {PeriodoTiempo.class})
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

    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(dtoCrearOfertaLaboralEmpresaAdministrador.getUuidEmpresa()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getTitulo()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getDuracionEstimadaValor(), PeriodoTiempo.obtenerPeriodoTiempo(dtoCrearOfertaLaboralEmpresaAdministrador.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getTurnoTrabajo()))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(dtoCrearOfertaLaboralEmpresaAdministrador.getNumeroVacantes()))")
    public abstract OfertaLaboral mapDtoAOfertaLaboral (DtoCrearOfertaLaboralEmpresaAdministrador dtoCrearOfertaLaboralEmpresaAdministrador);
}
