package com.orangesoft.officium.empleadorApp.empresa.infraestructura.mappers;

import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.*;
import lombok.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;
@Mapper(componentModel = "spring", imports = {UUID.class, Empresa.class})
public abstract class MapeadorPersistenciaEmpresa {
    @Mapping(target = "uuid", expression = "java(UUID.fromString(empresa.getIdEmpresa().getIdEmpresa()))")
    @Mapping(target = "nombre", expression = "java(empresa.getNombreEmpresa().getNombreEmpresa())")
    @Mapping(target = "correoElectronico", expression = "java(empresa.getCorreoElectronicoEmpresa().getCorreoElectronicoEmpresa())")
    @Mapping(target = "direccionCalle", expression = "java(empresa.getDireccionEmpresa().getDireccionEmpresa())")
    @Mapping(target = "codigoPostal", expression = "java(empresa.getCodigoPostalEmpresa().getCodigoPostalEmpresa())")
    @Mapping(target = "uuidPais", expression = "java(UUID.fromString(empresa.getIdPaisEmpresa().getIdPais()))")
    @Mapping(target = "uuidEstado", expression = "java(UUID.fromString(empresa.getIdEmpresa().getIdEmpresa()))")
    @Mapping(target = "uuidCiudad", expression = "java(UUID.fromString(empresa.getIdCiudadEmpresa().getIdCiudad()))")
    public abstract PersistenciaEmpresa EmpresaAPersistencia(Empresa empresa);

    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaEmpresa.getUuid().toString()))")
    @Mapping(target = "nombreEmpresa", expression = "java(new NombreEmpresa(persistenciaEmpresa.getNombre()))")
    @Mapping(target = "correoElectronicoEmpresa", expression = "java(new CorreoElectronicoEmpresa(persistenciaEmpresa.getCorreoElectronico()))")
    @Mapping(target = "direccionEmpresa", expression = "java(new DireccionEmpresa(persistenciaEmpresa.getDireccionCalle()))")
    @Mapping(target = "codigoPostalEmpresa", expression = "java(new CodigoPostalEmpresa(persistenciaEmpresa.getCodigoPostal()))")
    @Mapping(target = "idPaisEmpresa", expression = "java(new IdPais(persistenciaEmpresa.getUuidPais().toString()))")
    @Mapping(target = "idEstadoEmpresa", expression = "java(new IdEstado(persistenciaEmpresa.getUuidEstado().toString()))")
    @Mapping(target = "idCiudadEmpresa", expression = "java(new IdCiudad(persistenciaEmpresa.getUuidCiudad().toString()))")
    public abstract Empresa PersistenciaAEmpresa(PersistenciaEmpresa persistenciaEmpresa);

}

