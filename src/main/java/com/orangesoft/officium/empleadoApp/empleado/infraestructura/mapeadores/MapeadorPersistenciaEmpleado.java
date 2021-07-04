package com.orangesoft.officium.empleadoApp.empleado.infraestructura.mapeadores;

import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.empleadoApp.cuenta.dominio.EnumEstadoCuentaEmpleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.*;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.persistencia.entidades.PersistenciaEmpleado;
import com.orangesoft.officium.empleadoApp.genero.dominio.EnumGeneroEmpleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports ={UUID.class,
        EnumGeneroEmpleado.class,
        EnumEstadoCuentaEmpleado.class,
        IdEmpleado.class,
        CorreoElectronicoEmpleado.class,
        NombreEmpleado.class,
        GeneroEmpleado.class,
        NumeroTelefonicoEmpleado.class,
        FechaNacimientoEmpleado.class,
        ActivoEmpleado.class,
        IdPais.class,
        IdEstado.class,
        IdCiudad.class} )
public abstract class MapeadorPersistenciaEmpleado {
    @Mapping(target = "idEmpleado", expression = "java(new IdEmpleado(persistenciaEmpleado.getUuid().toString()))")
    @Mapping(target = "correoElectronicoEmpleado", expression = "java(new CorreoElectronicoEmpleado(persistenciaEmpleado.getCorreoElectronico()))")
    @Mapping(target = "nombreEmpleado", expression = "java(new NombreEmpleado(persistenciaEmpleado.getPrimerNombre(), persistenciaEmpleado.getSegundoNombre(),persistenciaEmpleado.getPrimerApellido(),persistenciaEmpleado.getSegundoApellido()))")
    @Mapping(target = "generoEmpleado", expression = "java(new GeneroEmpleado(persistenciaEmpleado.getGenero()=='M'? EnumGeneroEmpleado.HOMBRE: EnumGeneroEmpleado.MUJER))")
    @Mapping(target = "numeroTelefonicoEmpleado", expression = "java(new NumeroTelefonicoEmpleado(persistenciaEmpleado.getNumeroTelefonico()))")
    @Mapping(target = "fechaNacimientoEmpleado", expression = "java(new FechaNacimientoEmpleado(persistenciaEmpleado.getFechaNacimiento()))")
    @Mapping(target = "activoEmpleado", expression = "java(new ActivoEmpleado(persistenciaEmpleado.getActivo()==Boolean.TRUE? EnumEstadoCuentaEmpleado.ACTIVO: EnumEstadoCuentaEmpleado.INACTIVO))")
    @Mapping(target = "idPais", expression = "java(new IdPais(persistenciaEmpleado.getUuidPais().toString()))")
    @Mapping(target = "idEstado", expression = "java(new IdEstado(persistenciaEmpleado.getUuidEstado().toString()))")
    @Mapping(target = "idCiudad", expression = "java(new IdCiudad(persistenciaEmpleado.getUuidCiudad().toString()))")
    public abstract Empleado mapPersistenciaAEmpleado(PersistenciaEmpleado persistenciaEmpleado);
}
