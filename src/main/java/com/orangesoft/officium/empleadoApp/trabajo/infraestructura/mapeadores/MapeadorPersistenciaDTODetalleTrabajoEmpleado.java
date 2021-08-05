package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores;

import com.orangesoft.officium.comun.persistencia.trabajo.PersistenciaTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryDetalleDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.DetalleTrabajoEmpleadoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        ArrayList.class
})
public abstract class MapeadorPersistenciaDTODetalleTrabajoEmpleado {

    @Mapping(target = "uuid", expression = "java(queryDetalleDTO.getUuid().toString())")
    @Mapping(target = "titulo", expression = "java(queryDetalleDTO.getTitulo())")
    @Mapping(target = "fechaInicioTrabajo", expression = "java(queryDetalleDTO.getFechaInicioTrabajo().toString())")
    @Mapping(target = "cargo", expression = "java(queryDetalleDTO.getCargo())")
    @Mapping(target = "uuidEmpresa", expression = "java(queryDetalleDTO.getUuidEmpresa().toString())")
    @Mapping(target = "nombreEmpresa", expression = "java(queryDetalleDTO.getNombreEmpresa())")
    @Mapping(target = "direccionEmpresa", expression = "java(queryDetalleDTO.getDireccion().toString())")
    @Mapping(target = "numerosTelefonicos", expression = "java(convertirAArray(queryDetalleDTO.getNumerosTelefonicos()))")
    @Mapping(target = "estatus", expression = "java(queryDetalleDTO.getEstatus())")
    @Mapping(target = "sueldo", expression = "java(String.valueOf(queryDetalleDTO.getSueldo()))")
    @Mapping(target = "descripcion", expression = "java(queryDetalleDTO.getDescripcion())")
    @Mapping(target = "valorDuracion", expression = "java(String.valueOf(queryDetalleDTO.getValorDuracion()))")
    @Mapping(target = "escalaDuracion", expression = "java(queryDetalleDTO.getEscalaDuracion())")
    @Mapping(target = "turnoTrabajo", expression = "java(queryDetalleDTO.getTurnoTrabajo())")
    @Mapping(target = "fechaCulmiacionTrabajo", expression = "java(queryDetalleDTO.getFechaCulmiacionTrabajo().toString())")
    public abstract DetalleTrabajoEmpleadoDTO mapeadorPersistenciaDTOTrabajosEmpleado(QueryDetalleDTO queryDetalleDTO);

    protected ArrayList<String> convertirAArray(String string) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("+58-412.352.78.32");
        return strings;
    }
}
