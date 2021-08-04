package com.orangesoft.officium.administadorApp.administrador.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.administrador.dominio.PersonalAdministrativo;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.personalAdministrativo.PersistenciaPersonalAdministrativo;
import com.orangesoft.officium.comun.seguridad.autenticacion.mappers.MapeadorPersistenciaEntidad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class MapeadorPersistenciaPersonalAdministrativo implements MapeadorPersistenciaEntidad<PersonalAdministrativo, PersistenciaPersonalAdministrativo> {
    @Override
    @Mapping(target = "uuid", expression = "java(persistencia.getUuid())")
    @Mapping(target = "primerNombre", expression = "java(persistencia.getPrimerNombre())")
    @Mapping(target = "primerApellido", expression = "java(persistencia.getPrimerApellido())")
    @Mapping(target = "numeroTelefonico", expression = "java(persistencia.getCorreoElectronico())")
    @Mapping(target = "cargo", expression = "java(persistencia.getCargo())")
    public abstract PersonalAdministrativo mapearAEntidad(PersistenciaPersonalAdministrativo persistencia);
}
