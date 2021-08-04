package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.mappers;

import com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects.IdEmpleado;
import com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects.NombreEmpleado;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.CargoOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.TituloOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.PostulacionOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.ComentarioPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.query.QDtoDetallePropuestaOfertaLaboralAdministrador;
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
public abstract class MapeadorQDtoDetallePostulacionOfertaLaboralAdministrador {
    @Mapping(target = "idPostulacion", expression = "java(new IdPostulacionOfertaLaboral(qDtoDetallePropuestaOfertaLaboralAdministrador.getUuid()))")
    @Mapping(target = "idOfertaLaboral", expression = "java(new IdOfertaLaboral(qDtoDetallePropuestaOfertaLaboralAdministrador.getUuidOferta()))")
    @Mapping(target = "tituloOfertaLaboral", expression = "java(new TituloOfertaLaboral(qDtoDetallePropuestaOfertaLaboralAdministrador.getTituloOferta()))")
    @Mapping(target = "cargoOfertaLaboral", expression = "java(new CargoOfertaLaboral(qDtoDetallePropuestaOfertaLaboralAdministrador.getCargoOferta()))")
    @Mapping(target = "estatusPostulacionOfertaLaboral", expression = "java(EnumEstatusPostulacionOfertaLaboral.valueOf(qDtoDetallePropuestaOfertaLaboralAdministrador.getEstatus()))")
    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(qDtoDetallePropuestaOfertaLaboralAdministrador.getUuidEmpresa()))")
    @Mapping(target = "nombreEmpresa", expression = "java(new NombreEmpresa(qDtoDetallePropuestaOfertaLaboralAdministrador.getNombreEmpresa()))")
    @Mapping(target = "idEmpleado", expression = "java(new IdEmpleado(qDtoDetallePropuestaOfertaLaboralAdministrador.getUuidEmpleado()))")
    @Mapping(target = "nombreEmpleado", expression = "java(new NombreEmpleado(qDtoDetallePropuestaOfertaLaboralAdministrador.getPrimerNombreEmpleado()+qDtoDetallePropuestaOfertaLaboralAdministrador.getPrimerApellidoEmpleado()))")
    @Mapping(target = "comentarioPostulacion", expression = "java(new ComentarioPostulacionOfertaLaboral(qDtoDetallePropuestaOfertaLaboralAdministrador.getComentario()))")
    public abstract PostulacionOfertaLaboralAdministrador mapQDtoAPostulacion (QDtoDetallePropuestaOfertaLaboralAdministrador qDtoDetallePropuestaOfertaLaboralAdministrador);
}
