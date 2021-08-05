package com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers;

import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumTurnoOfertaLaboral;
import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.generics.TuplaEmpresaOfertaLaboral;
import com.orangesoft.officium.comun.generics.TuplaOfertaLaboral;
import com.orangesoft.officium.comun.generics.TuplaPersistenciaEmpresaOferta;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.comun.ubicacion.dominio.Direccion;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.*;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.*;
import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;
import java.util.ArrayList;
import java.util.UUID;

@Getter
public class OfertaLaboralEmpleadoMother {
    private final UUID empresaUUID = UUID.randomUUID();
    private final UUID ofertaUUID =  UUID.randomUUID();
    private final Instant fechaCreacion = Instant.now();
    private final Direccion direccion = new Direccion(new IdDireccion(UUID.randomUUID()), new CalleUnoDireccion("Ninguno"), new CalleDosDireccion("Ninguno"), new CodigoPostalDireccion("Ninguno"), new IdCiudad(UUID.randomUUID()));
    private final UUID uuidPostulacion = UUID.randomUUID();

    public DtoOfertasLaboralesActivasEmpleado obtenerDtoOfertaLaboralPython() {
        return new DtoOfertasLaboralesActivasEmpleado(
                ofertaUUID.toString(),
                "Se busca desarrollador en Python",
                fechaCreacion.toString(),
                "Desarrollador 2",
                8320.00f,
                "USD",
                50,
                "HORA",
                "DIURNO",
                2,
                "Cobras y lagartos SoftwareFactory"
        );
    }

    public DtoDetalleOfertaLaboralActivaEmpleado obtenerDtoDetallesOfertaLaboralPython() {
        return new DtoDetalleOfertaLaboralActivaEmpleado(
                ofertaUUID.toString(),
                "Se busca desarrollador en Python",
                fechaCreacion.toString(),
                fechaCreacion.toString(),
                "Desarrollador 2",
                "USD",
                8320.00f,
                "Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia",
                50,
                "HORA",
                "DIURNO",
                2,
                "Ninguno",
                "Ninguno",
                 empresaUUID.toString(),
                "Cobras y lagartos SoftwareFactory",
                "Todos los caminos llevan a Roma",
                new ArrayList<>()
        );
    }

    public Tupla<NombreEmpresa,OfertaLaboral> obtenerEntidadOfertaLaboralPython() {
        return new TuplaOfertaLaboral(new NombreEmpresa("Cobras y lagartos SoftwareFactory"),
                new OfertaLaboral(
                new IdEmpresa(empresaUUID),
                new IdOfertaLaboral(ofertaUUID),
                new TituloOfertaLaboral("Se busca desarrollador en Python"),
                new FechaPublicacionOfertaLaboral(fechaCreacion,null, fechaCreacion),
                new CargoOfertaLaboral("Desarrollador 2"),
                new SueldoOfertaLaboral(8320.00f, EnumMoneda.USD),
                new DescripcionOfertaLaboral("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia"),
                new DuracionEstimadaOfertaLaboral(50, EnumEscalaDuracionOfertaLaboral.DIA),
                new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.DIURNO),
                new NumeroVacantes(2),
                new RequisitosEspecialesOfertaLaboral("Ninguno"),
                new EstadoOfertaLaboral(EnumEstatusOfertaLaboral.PUBLICADO),
                new ArrayList<Habilidad>(),
                new ArrayList<PostulacionOfertaLaboral>()
        ));
    }

    public Tupla<Empresa,OfertaLaboral> obtenerEmpresaOfertaLaboralPython() {
        return new TuplaEmpresaOfertaLaboral(
                new Empresa(
                        new IdEmpresa(empresaUUID),
                        new NombreEmpresa("Cobras y lagartos SoftwareFactory"),
                        new CorreoElectronicoEmpresa("daniel@bello.notrabaja"),
                        new EstatusEmpresa("Ninguno"),
                        new RequisitosEspecialesEmpresa("Ninguno"),
                        direccion),
                new OfertaLaboral(
                        new IdEmpresa(empresaUUID),
                        new IdOfertaLaboral(ofertaUUID),
                        new TituloOfertaLaboral("Se busca desarrollador en Python"),
                        new FechaPublicacionOfertaLaboral(fechaCreacion,null, fechaCreacion),
                        new CargoOfertaLaboral("Desarrollador 2"),
                        new SueldoOfertaLaboral(8320.00f, EnumMoneda.USD),
                        new DescripcionOfertaLaboral("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia"),
                        new DuracionEstimadaOfertaLaboral(50, EnumEscalaDuracionOfertaLaboral.HORA),
                        new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.DIURNO),
                        new NumeroVacantes(2),
                        new RequisitosEspecialesOfertaLaboral("Ninguno"),
                        new EstadoOfertaLaboral(EnumEstatusOfertaLaboral.PUBLICADO),
                        new ArrayList<Habilidad>(),
                        new ArrayList<PostulacionOfertaLaboral>()
        ));
    }


    public Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> obtenerPersistenciaEmpresaOfertaLaboralPython() {
        PersistenciaOfertaLaboral persistenciaOfertaLaboral = new PersistenciaOfertaLaboral();
        persistenciaOfertaLaboral.setUuid(uuidPostulacion);
        persistenciaOfertaLaboral.setTitulo("Se busca desarrollador en Python");
        persistenciaOfertaLaboral.setFechaPublicacion(fechaCreacion);
        persistenciaOfertaLaboral.setFechaLimite(fechaCreacion);
        persistenciaOfertaLaboral.setCargo("Desarrollador 2");
        persistenciaOfertaLaboral.setSueldo(8320.00f);
        persistenciaOfertaLaboral.setDescripcion("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia");
        persistenciaOfertaLaboral.setValorDuracion(50);
        persistenciaOfertaLaboral.setEscalaDuracion("HORA");
        persistenciaOfertaLaboral.setTurnoTrabajo("DIURNO");
        persistenciaOfertaLaboral.setNumeroVacantes(2);
        persistenciaOfertaLaboral.setEstatus("PUBLICADO");
        persistenciaOfertaLaboral.setUuidEmpresa(empresaUUID);
        persistenciaOfertaLaboral.setFechaUltimaModificacion(fechaCreacion);
        persistenciaOfertaLaboral.setRequisitosEspeciales("Ninguno");
        PersistenciaEmpresa persistenciaEmpresa = new PersistenciaEmpresa();
        persistenciaEmpresa.setUuid(empresaUUID);
        persistenciaEmpresa.setNombre("Cobras y lagartos SoftwareFactory");
        persistenciaEmpresa.setEstatus("ACTIVO");
        persistenciaEmpresa.setCorreoElectronico("daniel@bello.notrabaja");
        persistenciaEmpresa.setToken(empresaUUID.toString());
        persistenciaEmpresa.setUuidDireccion(direccion.getIdDireccion().getUuid());
        persistenciaEmpresa.setRequisitosEspeciales("Ninguno");
        return new TuplaPersistenciaEmpresaOferta(persistenciaEmpresa,persistenciaOfertaLaboral);
    }

    public PersistenciaOfertaLaboral obtenerPersistenciaOfertaLaboralPython() {
        PersistenciaOfertaLaboral persistenciaOfertaLaboral = new PersistenciaOfertaLaboral();
        persistenciaOfertaLaboral.setUuid(uuidPostulacion);
        persistenciaOfertaLaboral.setTitulo("Se busca desarrollador en Python");
        persistenciaOfertaLaboral.setFechaPublicacion(fechaCreacion);
        persistenciaOfertaLaboral.setFechaLimite(fechaCreacion);
        persistenciaOfertaLaboral.setCargo("Desarrollador 2");
        persistenciaOfertaLaboral.setSueldo(8320.00f);
        persistenciaOfertaLaboral.setDescripcion("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia");
        persistenciaOfertaLaboral.setValorDuracion(50);
        persistenciaOfertaLaboral.setEscalaDuracion("HORA");
        persistenciaOfertaLaboral.setTurnoTrabajo("DIURNO");
        persistenciaOfertaLaboral.setNumeroVacantes(2);
        persistenciaOfertaLaboral.setEstatus("PUBLICADO");
        persistenciaOfertaLaboral.setUuidEmpresa(empresaUUID);
        persistenciaOfertaLaboral.setFechaUltimaModificacion(fechaCreacion);
        persistenciaOfertaLaboral.setRequisitosEspeciales("Ninguno");
        return persistenciaOfertaLaboral;
    }

    public QDtoOfertasLaboralesActivas obtenerQDTOOfertaLaboralPython() {
        QDtoOfertasLaboralesActivas qDtoOfertasLaboralesActivas = new QDtoOfertasLaboralesActivas();
        qDtoOfertasLaboralesActivas.setNombreEmpresa("Cobras y lagartos SoftwareFactory");
        qDtoOfertasLaboralesActivas.setUuidEmpresa(empresaUUID);
        qDtoOfertasLaboralesActivas.setUuid(ofertaUUID);
        qDtoOfertasLaboralesActivas.setTitulo("Se busca desarrollador en Python");
        qDtoOfertasLaboralesActivas.setFechaPublicacion(fechaCreacion);
        qDtoOfertasLaboralesActivas.setFechaUltimaModificacion(fechaCreacion);
        qDtoOfertasLaboralesActivas.setFechaUltimaModificacion(fechaCreacion);
        qDtoOfertasLaboralesActivas.setCargo("Desarrollador 2");
        qDtoOfertasLaboralesActivas.setSueldo(8320.00f);
        qDtoOfertasLaboralesActivas.setDescripcion("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia");
        qDtoOfertasLaboralesActivas.setDuracionEstimada(50);
        qDtoOfertasLaboralesActivas.setDuracionEstimadaEscala("HORA");
        qDtoOfertasLaboralesActivas.setTurnoTrabajo("DIURNO");
        qDtoOfertasLaboralesActivas.setNumeroVacantes(2);
        qDtoOfertasLaboralesActivas.setEstatus("PUBLICADO");
        qDtoOfertasLaboralesActivas.setRequisitosEspeciales("Ninguno");
        return qDtoOfertasLaboralesActivas;
    }

    public DtoOfertasLaboralesActivasEmpleado obtenerDtoOfertaLaboralJava() {
        return new DtoOfertasLaboralesActivasEmpleado(
                ofertaUUID.toString(),
                "Se busca desarrollador en Java",
                fechaCreacion.toString(),
                "Desarrollador Infra III",
                15020.00f,
                "USD",
                50,
                "HORA",
                "DIURNO",
                2,
                "Cobras y lagartos SoftwareFactory"
        );
    }

    public Tupla<NombreEmpresa,OfertaLaboral> obtenerEntidadOfertaLaboralJava() {
        return new TuplaOfertaLaboral(new NombreEmpresa("Cobras y lagartos SoftwareFactory"),
                new OfertaLaboral(
                new IdEmpresa(empresaUUID),
                new IdOfertaLaboral(ofertaUUID),
                new TituloOfertaLaboral("Se busca desarrollador en Java"),
                new FechaPublicacionOfertaLaboral(fechaCreacion,null, fechaCreacion),
                new CargoOfertaLaboral("Desarrollador Infra III"),
                new SueldoOfertaLaboral(15020.00f, EnumMoneda.USD),
                new DescripcionOfertaLaboral("Se busca desarrollador en Java sin conocimientos de principios SOLID y con 10 años de experiencia"),
                new DuracionEstimadaOfertaLaboral(50, EnumEscalaDuracionOfertaLaboral.HORA),
                new TurnoTrabajoOfertaLaboral(EnumTurnoOfertaLaboral.DIURNO),
                new NumeroVacantes(2),
                new RequisitosEspecialesOfertaLaboral("Ninguno"),
                new EstadoOfertaLaboral(EnumEstatusOfertaLaboral.PUBLICADO),
                new ArrayList<>(),
                new ArrayList<>()
        ));
    }

}
