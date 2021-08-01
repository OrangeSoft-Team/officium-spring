package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoPais;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class
})
public abstract class MapeadorDTOPais {

    @Mapping(target = "uuidPais", expression = "java(pais.getIdPais().getUuid().toString())")
    @Mapping(target = "nombrePais", expression = "java(pais.getNombrePais().getNombrePais())")
    public abstract DtoPais mapPaisADto(Pais pais);

    @Mapping(target = "idPais", expression = "java(new IdPais(java.util.UUID.fromString(dtoPais.getUuidPais())))")
    @Mapping(target = "nombrePais", expression = "java(new NombrePais(dtoPais.getNombrePais()))")
    public abstract Pais mapDtoAPais (DtoPais dtoPais);

}
