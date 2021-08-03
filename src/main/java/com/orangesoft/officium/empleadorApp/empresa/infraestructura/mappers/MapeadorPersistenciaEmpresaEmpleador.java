package com.orangesoft.officium.empleadorApp.empresa.infraestructura.mappers;

import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.empleadorApp.direccion.Direccion;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.*;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;
@Mapper(componentModel = "spring", imports = {UUID.class,
        Empresa.class,
        IdEmpresa.class,
        NombreEmpresa.class,
        CorreoElectronicoEmpresa.class,
        DireccionEmpresa.class,
        CodigoPostalEmpresa.class,
        EnumEstadoEstadoEmpresa.class,
        Direccion.class
        //IdPais.class,
        //IdEstado.class,
        //IdCiudad.class
})
public abstract class MapeadorPersistenciaEmpresaEmpleador {
    @Mapping(target = "uuid", expression = "java(UUID.fromString(empresa.getIdEmpresa().getIdEmpresa()))")
    @Mapping(target = "nombre", expression = "java(empresa.getNombreEmpresa().getNombreEmpresa())")
    @Mapping(target = "correoElectronico", expression = "java(empresa.getCorreoElectronicoEmpresa().getCorreoElectronicoEmpresa())")
    @Mapping(target = "estatus", expression = "java(empresa.getEstadoEmpresa().toString())")
    @Mapping(target = "uuidDireccion", expression = "java(UUID.fromString(empresa.getDireccionEmpresa().toString()))")
    @Mapping(target = "requisitosEspeciales", expression = "java(empresa.getRequisitosEspeciales().toString())")
    public abstract PersistenciaEmpresa EmpresaAPersistencia(Empresa empresa);

    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaEmpresa.getUuid().toString()))")
    @Mapping(target = "nombreEmpresa", expression = "java(new NombreEmpresa(persistenciaEmpresa.getNombre()))")
    @Mapping(target = "correoElectronicoEmpresa", expression = "java(new CorreoElectronicoEmpresa(persistenciaEmpresa.getCorreoElectronico()))")
    @Mapping(target = "estadoEmpresa", expression = "java(new EstadoEmpresa(EnumEstadoEstadoEmpresa.valueOf(persistenciaEmpresa.getEstatus())))")
    @Mapping(target = "direccionEmpresa", expression = "java(new DireccionEmpresa(persistenciaEmpresa.getUuidDireccion().toString()))")
    @Mapping(target = "requisitosEspeciales", expression = "java(new RequisitosEspeciales(persistenciaEmpresa.getRequisitosEspeciales()))")
    public abstract Empresa PersistenciaAEmpresa(PersistenciaEmpresa persistenciaEmpresa);

}

