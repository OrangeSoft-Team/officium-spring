package com.orangesoft.officium.empleadoApp.empleado.infraestructura.mapeadores;

import com.orangesoft.officium.comun.dominio.empleado.EnumEstatusEmpleado;
import com.orangesoft.officium.comun.dominio.empleado.EnumNivelEducativoEmpleado;
import com.orangesoft.officium.comun.persistencia.direccion.PersistenciaDireccion;
import com.orangesoft.officium.comun.persona.EnumGenero;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaDireccion;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaDireccionImpl;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.*;
import com.orangesoft.officium.comun.persistencia.empleado.PersistenciaEmpleado;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


@Mapper(componentModel = "spring", imports ={
        UUID.class,
        IdEmpleado.class,
        CorreoElectronicoEmpleado.class,
        NombreCompletoEmpleado.class,
        GeneroEmpleado.class,
        NumeroTelefonicoEmpleado.class,
        FechaNacimientoEmpleado.class,
        EstatusEmpleado.class,
        EnumNivelEducativoEmpleado.class,
        EnumGenero.class,
        EnumEstatusEmpleado.class,
        PersistenciaDireccion.class,
        MapeadorPersistenciaDireccion.class} )

public abstract class MapeadorPersistenciaEmpleado {
    @Autowired
    protected final MapeadorPersistenciaDireccion mapeadorPersistenciaDireccion;

    protected MapeadorPersistenciaEmpleado() {
        mapeadorPersistenciaDireccion = new MapeadorPersistenciaDireccionImpl();
    }

    @Mapping(target = "habilidades", ignore = true)
    @Mapping(target = "experienciasLaborales", ignore = true)
    @Mapping(target = "idEmpleado", expression = "java(new IdEmpleado(persistenciaEmpleado.getUuid()))")
    @Mapping(target = "nombreCompletoEmpleado", expression = "java(new NombreCompletoEmpleado(persistenciaEmpleado.getPrimerNombre(), persistenciaEmpleado.getSegundoNombre(),persistenciaEmpleado.getPrimerApellido(),persistenciaEmpleado.getSegundoApellido()))")
    @Mapping(target = "correoElectronicoEmpleado", expression = "java(new CorreoElectronicoEmpleado(persistenciaEmpleado.getCorreoElectronico()))")
    @Mapping(target = "numeroTelefonicoEmpleado", expression = "java(new NumeroTelefonicoEmpleado(persistenciaEmpleado.getTelefono()))")
    @Mapping(target = "nivelEducativoEmpleado", expression = "java(new NivelEducativoEmpleado(EnumNivelEducativoEmpleado.valueOf(persistenciaEmpleado.getNivelEducativo())))")
    @Mapping(target = "estatusEmpleado", expression = "java(new EstatusEmpleado(EnumEstatusEmpleado.valueOf(persistenciaEmpleado.getEstatus())))")
    @Mapping(target = "generoEmpleado", expression = "java(new GeneroEmpleado(EnumGenero.valueOf(persistenciaEmpleado.getGenero())))")
    @Mapping(target = "fechaNacimientoEmpleado", expression = "java(new FechaNacimientoEmpleado(persistenciaEmpleado.getFechaNacimiento()))")
    @Mapping(target = "direccionEmpleado", expression = "java(mapeadorPersistenciaDireccion.persistenciaADireccion(persistenciaDireccion))")
    public abstract Empleado mapPersistenciaAEmpleado(PersistenciaEmpleado persistenciaEmpleado, PersistenciaDireccion persistenciaDireccion);
}
