package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoCiudad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class MapeadorDTOCiudad {

    @Mapping(target = "uuidPais", expression = "java(ciudad.getIdPais().getIdPais())")
    @Mapping(target = "uuidEstado", expression = "java(ciudad.getIdEstado().getIdEstado())")
    @Mapping(target = "uuidCiudad", expression = "java(ciudad.getIdCiudad().getIdCiudad())")
    @Mapping(target = "nombreCiudad", expression = "java(ciudad.getNombreCiudad().getNombreCiudad())")
    public abstract DtoCiudad mapCiudadADto(Ciudad ciudad);

    @Mapping(target = "idPais", expression = "java(new IdPais(dtoCiudad.getUuidPais()))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(dtoCiudad.getUuidEstado()))")
    @Mapping(target = "idCiudad", expression = "java(new IdCiudad(dtoCiudad.getUuidCiudad()))")
    @Mapping(target = "nombreCiudad", expression = "java(new NombreCiudad(dtoCiudad.getNombreCiudad()))")
    public abstract Ciudad mapDtoACiudad (DtoCiudad dtoCiudad);
}
