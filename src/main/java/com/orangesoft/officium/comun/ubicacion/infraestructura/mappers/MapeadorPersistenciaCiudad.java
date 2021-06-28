package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.IdPersistenciaCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaCiudad;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class, IdPersistenciaCiudad.class})
public abstract class MapeadorPersistenciaCiudad {
    @Mapping(target = "idPersistenciaCiudad", expression = "java(new IdPersistenciaCiudad(UUID.fromString(ciudad.getIdPais().getIdPais()),UUID.fromString(ciudad.getIdEstado().getIdEstado()),UUID.fromString(ciudad.getIdCiudad().getIdCiudad())))")
    @Mapping(target = "nombre", expression = "java(ciudad.getNombreCiudad().getNombreCiudad())")
    public abstract PersistenciaCiudad ciudadAPersistencia(Ciudad ciudad);

    @Mapping(target = "idPais", expression = "java(new IdPais(persistenciaCiudad.getIdPersistenciaCiudad().getUuidPais().toString()))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(persistenciaCiudad.getIdPersistenciaCiudad().getUuidEstado().toString()))")
    @Mapping(target = "idCiudad", expression = "java(new IdCiudad(persistenciaCiudad.getIdPersistenciaCiudad().getUuid().toString()))")
    @Mapping(target = "nombreCiudad", expression = "java(new NombreCiudad(persistenciaCiudad.getNombre()))")
    public abstract Ciudad persistenciaCiudadACiudad(PersistenciaCiudad persistenciaCiudad);
}

