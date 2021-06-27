package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoEstado;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class MapeadorDTOEstado {

    @Mapping(target = "uuidPais", expression = "java(estado.getIdPais().getIdPais())")
    @Mapping(target = "uuidEstado", expression = "java(estado.getIdEstado().getIdEstado())")
    @Mapping(target = "nombreEstado", expression = "java(estado.getNombreEstado().getNombreEstado())")
    public abstract DtoEstado mapEstadoADto(Estado estado);

    @Mapping(target = "idPais", expression = "java(new IdPais(dtoEstado.getUuidPais()))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(dtoEstado.getUuidEstado()))")
    @Mapping(target = "nombreEstado", expression = "java(new NombreEstado(dtoEstado.getNombreEstado()))")
    public abstract Estado mapDtoAEstado (DtoEstado dtoEstado);
}
