package com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores;

import com.orangesoft.officium.comun.persistencia.habilidad.PersistenciaHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.CategoriaHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.IdHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.NombreHabilidad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class,
        IdHabilidad.class,
        NombreHabilidad.class,
        CategoriaHabilidad.class})
public abstract class MapeadorPersistenciaHabilidad {

    @Mapping(target = "idHabilidad", expression = "java(new IdHabilidad(persistenciaHabilidad.getUuid()))")
    @Mapping(target = "nombreHabilidad", expression = "java(new NombreHabilidad(persistenciaHabilidad.getNombre()))")
    @Mapping(target = "categoriaHabilidad", expression = "java(new CategoriaHabilidad(persistenciaHabilidad.getCategoria()))")
    public abstract Habilidad  PersistenciaAHabilidad(PersistenciaHabilidad persistenciaHabilidad);
}
