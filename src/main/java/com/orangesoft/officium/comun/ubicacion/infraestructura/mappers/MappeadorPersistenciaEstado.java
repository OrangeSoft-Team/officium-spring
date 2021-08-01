package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaEstado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class})
public abstract class MappeadorPersistenciaEstado {

    @Mapping(target = "idPais", expression = "java(new IdPais(persistenciaEstado.getUuidPais()))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(persistenciaEstado.getUuid()))")
    @Mapping(target = "nombreEstado", expression = "java(new NombreEstado(persistenciaEstado.getNombre()))")
    public abstract Estado persistenciaAEstado(PersistenciaEstado persistenciaEstado);

}
