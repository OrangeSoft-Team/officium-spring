package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores;

import com.orangesoft.officium.comun.persistencia.trabajo.PersistenciaTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryConsultaTrabajoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
     UUID.class
})
public abstract class MapeadorPersistenciaDTOTrabajosEmpleado {

    @Mapping(target = "uuid", expression = "java(query.getUuid().toString())")
    @Mapping(target = "titulo", expression = "java(query.getTitulo())")
    @Mapping(target = "fechaInicioTrabajo", expression = "java(query.getFechaInicioTrabajo().toString())")
    @Mapping(target = "cargo", expression = "java(query.getCargo())")
    @Mapping(target = "nombreEmpresa", expression = "java(query.getNombreEmpresa())")
    @Mapping(target = "estatus", expression = "java(query.getEstatus())")
    public abstract TrabajosEmpleadoDTO PersistenciaATrabajosEmpleadoDTO(QueryConsultaTrabajoDTO query);
}
