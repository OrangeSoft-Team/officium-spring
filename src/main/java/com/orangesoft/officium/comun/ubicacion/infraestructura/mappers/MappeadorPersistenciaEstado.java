package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.PersistenciaEstado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public abstract class MappeadorPersistenciaEstado {

    @Mapping(target = "IDPersistenciaEstado.uuid", expression = "java(new IDPersistenciaEstado(UUID.fromString(estado.getIdPais().getIdPais()), UUID.fromString(estado.getIdEstado().getIdEstado()))))")
    @Mapping(target = "nombre", expression = "java(estado.getNombreEstado().getNombreEstado())")
    public abstract PersistenciaEstado estadoAPersistencia(Estado estado);

    @Mapping(target = "idPais", expression = "java(new IdPais(persistenciaEstado.getIdPersistenciaEstado().getUuidPais().toString()))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(persistenciaEstado.getIdPersistenciaEstado().getUuid().toString()))")
    @Mapping(target = "nombreEstado", expression = "java(new NombreEstado(persistenciaEstado.getNombre()))")
    public abstract Estado persistenciaAEstado(PersistenciaEstado persistenciaEstado);




}
