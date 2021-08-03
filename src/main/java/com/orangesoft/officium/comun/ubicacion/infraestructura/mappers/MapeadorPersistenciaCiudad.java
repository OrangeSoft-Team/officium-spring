package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Ciudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.AplicationContextMapeadorPersistenciaCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaCiudad;

import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades.PersistenciaEstado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioEstado;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        RepositorioEstado.class,
        MappeadorPersistenciaEstado.class
    })
public abstract class MapeadorPersistenciaCiudad {

    @Mapping(target = "idPais", expression = "java(new IdPais(persistenciaEstado.getUuidPais()))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(persistenciaCiudad.getUuidEstado()))")
    @Mapping(target = "idCiudad", expression = "java(new IdCiudad(persistenciaCiudad.getUuid()))")
    @Mapping(target = "nombreCiudad", expression = "java(new NombreCiudad(persistenciaCiudad.getNombre()))")
    public abstract Ciudad persistenciaCiudadACiudad(PersistenciaCiudad persistenciaCiudad, PersistenciaEstado persistenciaEstado);
}

