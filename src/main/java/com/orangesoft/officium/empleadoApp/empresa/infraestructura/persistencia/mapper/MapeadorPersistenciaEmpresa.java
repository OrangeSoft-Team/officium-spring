package com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.mapper;

import com.orangesoft.officium.comun.persistencia.direccion.PersistenciaDireccion;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaDireccion;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = {
        UUID.class,
        IdEmpresa.class,
        NombreEmpresa.class,
        CorreoElectronicoEmpresa.class,
        EstatusEmpresa.class,
        RequisitosEspecialesEmpresa.class,
        MapeadorPersistenciaDireccion.class
})
public abstract class MapeadorPersistenciaEmpresa {
    private IdEmpresa idEmpresa;
    private NombreEmpresa nombreEmpresa;
    private CorreoElectronicoEmpresa correoElectronicoEmpresa;
    private EstatusEmpresa estatusEmpresa;
    private RequisitosEspecialesEmpresa requisitosEspecialesEmpresa;

    @Autowired
    protected MapeadorPersistenciaDireccion mapeadorPersistenciaDireccion;

    @Mapping(target = "idEmpresa", expression = "java(new IdEmpresa(persistenciaEmpresa.getUuid()))")
    @Mapping(target = "nombreEmpresa", expression = "java(new NombreEmpresa(persistenciaEmpresa.getNombre()))")
    @Mapping(target = "correoElectronicoEmpresa", expression = "java(new CorreoElectronicoEmpresa(persistenciaEmpresa.getCorreoElectronico()))")
    @Mapping(target = "direccionEmpresa", expression = "java(mapeadorPersistenciaDireccion.persistenciaADireccion(persistenciaDireccion))")
    @Mapping(target = "estatusEmpresa", expression = "java(new EstatusEmpresa(persistenciaEmpresa.getEstatus()))")
    @Mapping(target = "requisitosEspecialesEmpresa", expression = "java(new RequisitosEspecialesEmpresa(persistenciaEmpresa.getRequisitosEspeciales()))")
    public abstract Empresa PersistenciaAEmpresa(PersistenciaEmpresa persistenciaEmpresa, PersistenciaDireccion persistenciaDireccion);
}
