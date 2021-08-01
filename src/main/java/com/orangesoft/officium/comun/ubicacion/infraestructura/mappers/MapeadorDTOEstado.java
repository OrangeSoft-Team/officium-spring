package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoEstado;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class
})
public abstract class MapeadorDTOEstado {

    @Mapping(target = "uuidPais", expression = "java(estado.getIdPais().getUuid().toString())")
    @Mapping(target = "uuidEstado", expression = "java(estado.getIdEstado().getUuid().toString())")
    @Mapping(target = "nombreEstado", expression = "java(estado.getNombreEstado().getNombreEstado())")
    public abstract DtoEstado mapEstadoADto(Estado estado);

    @Mapping(target = "idPais", expression = "java(new IdPais(UUID.fromString(dtoEstado.getUuidPais())))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(UUID.fromString(dtoEstado.getUuidEstado())))")
    @Mapping(target = "nombreEstado", expression = "java(new NombreEstado(dtoEstado.getNombreEstado()))")
    public abstract Estado mapDtoAEstado (DtoEstado dtoEstado);
}
