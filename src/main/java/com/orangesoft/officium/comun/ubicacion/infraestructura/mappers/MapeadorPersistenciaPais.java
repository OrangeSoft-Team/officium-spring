package com.orangesoft.officium.comun.ubicacion.infraestructura.mappers;

import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.PersistenciaPais;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring")
public abstract class MapeadorPersistenciaPais {

    @Mapping(target = "idPais", expression = "java(new IdPais(uuidDeConversion(persistenciaPais)))")
    @Mapping(target = "nombrePais", expression = "java(new NombrePais(persistenciaPais.getNombre()))")
    public abstract Pais persistenciaAPais(PersistenciaPais persistenciaPais);

    @Mapping(target = "uuid", expression = "java(uuidAConversion(pais))")
    @Mapping(target = "nombre", expression = "java(pais.getNombrePais().getNombrePais())")
    public abstract PersistenciaPais paisAPersistencia(Pais pais);

    protected String uuidDeConversion(PersistenciaPais persistenciaPais) {
        return persistenciaPais.getUuid().toString();
    };

    protected UUID uuidAConversion(Pais pais) {
        return UUID.fromString(pais.getIdPais().getIdPais());
    }
}
