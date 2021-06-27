package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoPais;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class MapeadorPais {

    @Mapping(target = "uuidPais", expression = "java(pais.getIdPais().getIdPais())")
    @Mapping(target = "nombrePais", expression = "java(pais.getNombrePais().getNombrePais())")
    public abstract DtoPais mapPaisADto(Pais pais);

    @Mapping(target = "idPais", expression = "java(new IdPais(dtoPais.getUuidPais()))")
    @Mapping(target = "nombrePais", expression = "java(new NombrePais(dtoPais.getNombrePais()))")
    public abstract Pais mapDtoAPais (DtoPais dtoPais);
}
