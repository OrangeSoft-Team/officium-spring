package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaPais;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class})
public abstract class MapeadorPersistenciaPais {

    @Mapping(target = "idPais", expression = "java(new IdPais(persistenciaPais.getUuid()))")
    @Mapping(target = "nombrePais", expression = "java(new NombrePais(persistenciaPais.getNombre()))")
    public abstract Pais persistenciaAPais(PersistenciaPais persistenciaPais);
}
