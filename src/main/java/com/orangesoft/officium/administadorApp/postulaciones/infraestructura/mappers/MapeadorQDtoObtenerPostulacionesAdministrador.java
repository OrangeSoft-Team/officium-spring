package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects.IdEmpleado;
import com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects.NombreEmpleado;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.ComentarioPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.query.QDtoObtenerPostulacionesAdministrador;
import com.orangesoft.officium.comun.dominio.postulacionOfertaLaboral.EnumEstatusPostulacionOfertaLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = {
        IdPostulacionOfertaLaboral.class,
        IdOfertaLaboral.class,
        TituloOfertaLaboral.class,
        CargoOfertaLaboral.class,
        EnumEstatusPostulacionOfertaLaboral.class,
        IdEmpresa.class,
        NombreEmpresa.class,
        IdEmpleado.class,
        NombreEmpleado.class,
        ComentarioPostulacionOfertaLaboral.class
})
public abstract class MapeadorQDtoObtenerPostulacionesAdministrador {
    protected final String WHITE_ESPACE = " ";
    protected final String UNDERSCORE = "_";
    @Mapping(target = "idPostulacion", expression = "java(new IdPostulacionOfertaLaboral(qDtoObtenerPostulacionesAdministrador.getUuid()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoObtenerPostulacionesAdministrador.getUuidOferta()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoObtenerPostulacionesAdministrador.getTituloOferta()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoObtenerPostulacionesAdministrador.getCargoOferta()))")
    @Mapping(target = "estatusPostulacionOfertaLaboral", expression = "java(EnumEstatusPostulacionOfertaLaboral.valueOf(qDtoObtenerPostulacionesAdministrador.getEstatus().replace(this.WHITE_ESPACE, this.UNDERSCORE)))")
    //@Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(qDtoObtenerPostulacionesAdministrador.getCargoOferta()))")
    @Mapping(target = "nombreEmpresa", expression = "java(new NombreEmpresa(qDtoObtenerPostulacionesAdministrador.getNombreEmpresa()))")
    //@Mapping(target = "idEmpleado", expression = "java(new IdEmpleado(qDtoObtenerPostulacionesAdministrador.getCargoOferta()))")
    @Mapping(target = "nombreEmpleado", expression = "java(new NombreEmpleado(qDtoObtenerPostulacionesAdministrador.getPrimerNombreEmpleado()+qDtoObtenerPostulacionesAdministrador.getPrimerApellidoEmpleado()))")
    //@Mapping(target = "comentarioPostulacion", expression = "java(new ComentarioPostulacionOfertaLaboral(qDtoObtenerPostulacionesAdministrador.getCargoOferta()))")
    public abstract PostulacionOfertaLaboralAdministrador mapQDtoAPostulacion (QDtoObtenerPostulacionesAdministrador qDtoObtenerPostulacionesAdministrador);
}