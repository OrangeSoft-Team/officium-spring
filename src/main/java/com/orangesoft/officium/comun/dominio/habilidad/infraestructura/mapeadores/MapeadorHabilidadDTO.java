package com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores;

import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.CategoriaHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.IdHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.NombreHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class,
        IdHabilidad.class,
        NombreHabilidad.class,
        CategoriaHabilidad.class})
public abstract class MapeadorHabilidadDTO {

    @Mapping(target = "uuid", expression = "java(habilidad.getIdHabilidad().getUuid().toString())")
    @Mapping(target = "nombre", expression = "java(habilidad.getNombreHabilidad().getNombre())")
    @Mapping(target = "categoria", expression = "java(habilidad.getCategoriaHabilidad().getCategoria())")
    public abstract DtoHabilidad HabilidadADtoHabilidad(Habilidad habilidad);

    @Mapping(target = "idHabilidad", expression = "java(new IdHabilidad(UUID.fromString(dtoHabilidad.getUuid())))")
    @Mapping(target = "nombreHabilidad", expression = "java(new NombreHabilidad(dtoHabilidad.getNombre()))")
    @Mapping(target = "categoriaHabilidad", expression = "java(new CategoriaHabilidad(dtoHabilidad.getCategoria()))")
    public abstract Habilidad DtoHabilidadAHabilidad(DtoHabilidad dtoHabilidad);
}
