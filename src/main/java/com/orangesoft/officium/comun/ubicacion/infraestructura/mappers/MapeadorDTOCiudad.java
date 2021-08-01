package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoCiudad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class
})
public abstract class MapeadorDTOCiudad {

    @Mapping(target = "uuidPais", expression = "java(ciudad.getIdPais().getUuid().toString())")
    @Mapping(target = "uuidEstado", expression = "java(ciudad.getIdEstado().getUuid().toString())")
    @Mapping(target = "uuidCiudad", expression = "java(ciudad.getIdCiudad().getUuid().toString())")
    @Mapping(target = "nombreCiudad", expression = "java(ciudad.getNombreCiudad().getNombreCiudad())")
    public abstract DtoCiudad mapCiudadADto(Ciudad ciudad);

    @Mapping(target = "idPais", expression = "java(new IdPais(UUID.fromString(dtoCiudad.getUuidPais())))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(UUID.fromString(dtoCiudad.getUuidEstado())))")
    @Mapping(target = "idCiudad", expression = "java(new IdCiudad(UUID.fromString(dtoCiudad.getUuidCiudad())))")
    @Mapping(target = "nombreCiudad", expression = "java(new NombreCiudad(dtoCiudad.getNombreCiudad()))")
    public abstract Ciudad mapDtoACiudad (DtoCiudad dtoCiudad);
}
