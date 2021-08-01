package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.CategoriaHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.IdHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.NombreHabilidad;
import com.orangesoft.officium.comun.persistencia.habilidad.PersistenciaHabilidad;
import com.orangesoft.officium.comun.persistencia.habilidadesOfertaLaboral.PersistenciaHabilidadOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.habilidadesOfertaLaboral.PersistenciaIdHabilidadOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = {PersistenciaIdHabilidadOfertaLaboral.class,
        IdHabilidad.class,
        NombreHabilidad.class,
        CategoriaHabilidad.class
    })
public abstract class MapeadorAPersistenciaHabilidadOfertaLaboralAdministrador {
    @Mapping(target = "id", expression = "java(new PersistenciaIdHabilidadOfertaLaboral(idHabilidad.getUuid(), idOfertaLaboral.getIdOfertaLaboral()))")
    public abstract PersistenciaHabilidadOfertaLaboral habilidadAPersistencia(IdOfertaLaboral idOfertaLaboral, IdHabilidad idHabilidad);

    @Mapping(target = "idHabilidad", expression = "java(new IdHabilidad(persistenciaHabilidad.getUuid()))")
    @Mapping(target = "nombreHabilidad", expression = "java(new NombreHabilidad(persistenciaHabilidad.getNombre()))")
    @Mapping(target = "categoriaHabilidad", expression = "java(new CategoriaHabilidad(persistenciaHabilidad.getCategoria()))")
    public abstract Habilidad persistenciaAHabilidad(PersistenciaHabilidad persistenciaHabilidad);
}
