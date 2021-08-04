package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.IdHabilidad;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        EnumEscalaDuracionOfertaLaboral.class,
        DateTimeFormatter.class,
        LocalDateTime.class,
        EnumEstatusOfertaLaboral.class,
        IdOfertaLaboral.class,
        IdEmpresa.class,
        TituloOfertaLaboral.class,
        FechaOfertaLaboral.class,
        CargoOfertaLaboral.class,
        SueldoOfertaLaboral.class,
        DescripcionOfertaLaboral.class,
        DuracionEstimadaOfertaLaboral.class,
        TurnoTrabajoOfertaLaboral.class,
        NumeroVacantesOfertaLaboral.class,
        EstadoOfertaLaboral.class,
        ZoneId.class,
        EnumTurnoOfertaLaboral.class
})
public abstract class MapeadorDtoModificarOfertaLaboralAdministrador {
//    @Mapping(target = "titulo", expression = "java(ofertaLaboral.getTituloOfertaLaboral().getTituloOfertaLaboral())")
//    @Mapping(target = "cargo", expression = "java(ofertaLaboral.getCargoOfertaLaboral().getCargoOfertaLaboral())")
//    @Mapping(target = "sueldo", expression = "java(ofertaLaboral.getSueldoOfertaLaboral().getSueldoOfertaLaboral())")
//    @Mapping(target = "descripcion", expression = "java(ofertaLaboral.getDescripcionOfertaLaboral().getDescripcionOfertaLaboral())")
//    @Mapping(target = "duracionEstimadaValor", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getDuracionEstimadaOfertaLaboral())")
//    @Mapping(target = "duracionEstimadaEscala", expression = "java(ofertaLaboral.getDuracionEstimadaOfertaLaboral().getPeriodoTiempoOfertaLaboral().toString())")
//    @Mapping(target = "turnoTrabajo", expression = "java(ofertaLaboral.getTurnoTrabajoOfertaLaboral().getTurnoTrabajoOfertaLaboral().toString())")
//    @Mapping(target = "numeroVacantes", expression = "java(ofertaLaboral.getNumeroVacantesOfertaLaboral().getNumeroVacantesOfertaLaboral())")
//    @Mapping(target = "requisitosEspeciales", expression = "java(ofertaLaboral.getRequisitosEspecialesOfertaLaboral().getRequisitosEspeciales())")
//    public abstract DtoModificarOfertaLaboralAdministrador mapOfertaLaboralADto(OfertaLaboral ofertaLaboral);

    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(UUID.randomUUID()))")
    @Mapping(target = "idEmpresaOfertaLaboral", expression = "java(new IdEmpresa(UUID.randomUUID()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(dtoModificarOfertaLaboralAdministrador.getTitulo()))")
    @Mapping(target = "fechaPublicacionOfertaLaboral", expression = "java(new FechaOfertaLaboral( DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  LocalDateTime.now()  ) ))")
    @Mapping(target = "fechaUltimaModificacionOfertaLaboral", expression = "java(new FechaOfertaLaboral( DateTimeFormatter.ofPattern(\"yyyy-MM-dd\").withZone( ZoneId.systemDefault() ).format(  LocalDateTime.now()  ) ))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(dtoModificarOfertaLaboralAdministrador.getCargo()))")
    @Mapping(target = "sueldoOfertaLaboral", expression = "java(new SueldoOfertaLaboral(dtoModificarOfertaLaboralAdministrador.getSueldo()))")
    @Mapping(target = "descripcionOfertaLaboral", expression = "java(new DescripcionOfertaLaboral(dtoModificarOfertaLaboralAdministrador.getDescripcion()))")
    @Mapping(target = "duracionEstimadaOfertaLaboral", expression = "java(new DuracionEstimadaOfertaLaboral(dtoModificarOfertaLaboralAdministrador.getDuracionEstimadaValor(), EnumEscalaDuracionOfertaLaboral.valueOf(dtoModificarOfertaLaboralAdministrador.getDuracionEstimadaEscala())))")
    @Mapping(target = "turnoTrabajoOfertaLaboral", expression = "java(new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.valueOf(dtoModificarOfertaLaboralAdministrador.getTurnoTrabajo())))")
    @Mapping(target = "numeroVacantesOfertaLaboral", expression = "java(new NumeroVacantesOfertaLaboral(dtoModificarOfertaLaboralAdministrador.getNumeroVacantes()))")
    @Mapping(target = "estadoOfertaLaboral", expression = "java(new EstadoOfertaLaboral(EnumEstatusOfertaLaboral.PUBLICADO))")
    @Mapping(target = "requisitosEspecialesOfertaLaboral", expression = "java(new RequisitosEspecialesOfertaLaboral(dtoModificarOfertaLaboralAdministrador.getRequisitosEspeciales()))")
    public abstract OfertaLaboral mapDtoAOfertaLaboral (DtoModificarOfertaLaboralAdministrador dtoModificarOfertaLaboralAdministrador);

    public List<Habilidad> map(List<UUID> value){
        List<Habilidad> habilidades = new ArrayList<>();
        value.forEach(uuid -> {
            habilidades.add(new Habilidad(new IdHabilidad(uuid), null, null));
        });
        return habilidades;
    }
}
