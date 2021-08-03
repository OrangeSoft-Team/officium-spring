package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.persistencia.direccion.PersistenciaDireccion;
import com.orangesoft.officium.comun.ubicacion.dominio.Direccion;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.CalleDosDireccion;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.CalleUnoDireccion;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.CodigoPostalDireccion;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdDireccion;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.UUID;

@AllArgsConstructor
@Mapper(componentModel = "spring", imports = {
        UUID.class,
        IdDireccion.class,
        CalleUnoDireccion.class,
        CalleDosDireccion.class,
        CodigoPostalDireccion.class,
        Direccion.class,
        PersistenciaDireccion.class
        })
@Component
public abstract class MapeadorPersistenciaDireccion {

    @Mapping(target = "idDireccion", expression = "java(new IdDireccion(persistenciaDireccion.getUuid()))")
    @Mapping(target = "calleUnoDireccion", expression = "java(new CalleUnoDireccion(persistenciaDireccion.getCalleUno()))")
    @Mapping(target = "calleDosDireccion", expression = "java(new CalleDosDireccion(persistenciaDireccion.getCalleDos()))")
    @Mapping(target = "codigoPostalDireccion", expression = "java(new CodigoPostalDireccion(persistenciaDireccion.getCodigoPostal()))")
    @Mapping(target = "idCiudad", expression = "java(new IdCiudad(persistenciaDireccion.getUuidCiudad()))")
    public abstract Direccion persistenciaADireccion(PersistenciaDireccion persistenciaDireccion);
}
