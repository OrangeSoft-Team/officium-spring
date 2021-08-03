package com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.*;
import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class OfertaLaboralEmpleadoMother {
    private final UUID empresaUUID = UUID.randomUUID();
    private final UUID ofertaUUID =  UUID.randomUUID();
    private final Instant fechaCreacion = Instant.now();

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
        /*return new DtoDetalleOfertaLaboralActivaEmpleado(
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
                empresaUUID.toString(),
                "Cobras y lagartos SoftwareFactory",
                "Todos los caminos llevan a Roma"
        );*/
        return  null;
    }

    public Tupla<NombreEmpresa,OfertaLaboral> obtenerEntidadOfertaLaboralPython() {
        return null;
        /*new TuplaOfertaLaboral(new NombreEmpresa("Cobras y lagartos SoftwareFactory"),new OfertaLaboral(
                new IdEmpresa(empresaUUID.toString()),
                new IdOfertaLaboral(ofertaUUID),
                new TituloOfertaLaboral("Se busca desarrollador en Python"),
                new CargoOfertaLaboral("Desarrollador 2"),
                new FechaPublicacionOfertaLaboral(fechaCreacion,null),
                new SueldoOfertaLaboral(8320.00f, EnumMoneda.USD),
                new DescripcionOfertaLaboral("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia"),
                new DuracionEstimadaOfertaLaboral(50, EnumEscalaTiempo.HORA),
                new TurnoTrabajoOfertaLaboral(EnumTurnoTrabajo.DIURNO),
                new NumeroVacantes(2),
                new EstadoOfertaLaboral(EnumEstadoOfertaLaboral.PUBLICADA)
        ));
        * */
    }

    public Tupla<Empresa,OfertaLaboral> obtenerEmpresaOfertaLaboralPython() {
        return null;
        /*
        new TuplaEmpresaOfertaLaboral(
                new Empresa(
                        new IdEmpresa(empresaUUID.toString()),
                        new NombreEmpresa("Cobras y lagartos SoftwareFactory"),
                        new CorreoElectronicoEmpresa("daniel@bello.notrabaja"),
                        new DireccionEmpresa("Todos los caminos llevan a Roma"),
                        new CodigoPostalEmpresa("32424"),
                        new IdPais("7a424dee-7e50-4a01-ab6e-a09201677818"),
                        new IdEstado("23450ac5-23f6-4e4a-b2ab-4da5aee82070"),
                        new IdCiudad("7a424dee-7e50-4a01-ab6e-a09201677818")),
                new OfertaLaboral(
                        new IdEmpresa(empresaUUID.toString()),
                        new IdOfertaLaboral(ofertaUUID.toString()),
                        new TituloOfertaLaboral("Se busca desarrollador en Python"),
                        new CargoOfertaLaboral("Desarrollador 2"),
                        new FechaPublicacionOfertaLaboral(fechaCreacion,null),
                        new SueldoOfertaLaboral(8320.00f, EnumMoneda.USD),
                        new DescripcionOfertaLaboral("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia"),
                        new DuracionEstimadaOfertaLaboral(50, EnumEscalaTiempo.HORA),
                        new TurnoTrabajoOfertaLaboral(EnumTurnoTrabajo.DIURNO),
                        new NumeroVacantes(2),
                        new EstadoOfertaLaboral(EnumEstadoOfertaLaboral.PUBLICADA)
        ));
         */
    }

    public Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> obtenerPersistenciaEmpresaOfertaLaboralPython() {
        /*
        PersistenciaOfertaLaboral persistenciaOfertaLaboral = new PersistenciaOfertaLaboral();
        persistenciaOfertaLaboral.setIdPersistenciaOfertaLaboral(new IdPersistenciaOfertaLaboral(empresaUUID, ofertaUUID));
        persistenciaOfertaLaboral.setTitulo("Se busca desarrollador en Python");
        persistenciaOfertaLaboral.setCargo("Desarrollador 2");
        persistenciaOfertaLaboral.setFechaPublicacion(fechaCreacion);
        persistenciaOfertaLaboral.setFechaUltimaModificacion(fechaCreacion);
        persistenciaOfertaLaboral.setSueldo(8320.00f);
        persistenciaOfertaLaboral.setDivisa("USD");
        persistenciaOfertaLaboral.setDescripcion("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia");
        persistenciaOfertaLaboral.setDuracionEstimada("50");
        persistenciaOfertaLaboral.setDuracionEstimadaEscala("HORA");
        persistenciaOfertaLaboral.setTurnoTrabajo("DIURNO");
        persistenciaOfertaLaboral.setNumeroVacantes(2);
        persistenciaOfertaLaboral.setEstado('P');
        PersistenciaEmpresa persistenciaEmpresa = new PersistenciaEmpresa();
        persistenciaEmpresa.setUuid(empresaUUID);
        persistenciaEmpresa.setNombre("Cobras y lagartos SoftwareFactory");
        persistenciaEmpresa.setCorreoElectronico("daniel@bello.notrabaja");
        persistenciaEmpresa.setDireccionCalle("Todos los caminos llevan a Roma");
        persistenciaEmpresa.setCodigoPostal("32424");
        persistenciaEmpresa.setUuidPais(UUID.fromString("7a424dee-7e50-4a01-ab6e-a09201677818"));
        persistenciaEmpresa.setUuidEstado(UUID.fromString("23450ac5-23f6-4e4a-b2ab-4da5aee82070"));
        persistenciaEmpresa.setUuidCiudad(UUID.fromString("7a424dee-7e50-4a01-ab6e-a09201677818"));
        return new TuplaPersistenciaEmpresaOferta(persistenciaEmpresa,persistenciaOfertaLaboral);
         */
        return null;
    }

    public PersistenciaOfertaLaboral obtenerPersistenciaOfertaLaboralPython() {
        /*
        PersistenciaOfertaLaboral persistenciaOfertaLaboral = new PersistenciaOfertaLaboral();
        persistenciaOfertaLaboral.setIdPersistenciaOfertaLaboral(new IdPersistenciaOfertaLaboral(empresaUUID, ofertaUUID));
        persistenciaOfertaLaboral.setTitulo("Se busca desarrollador en Python");
        persistenciaOfertaLaboral.setCargo("Desarrollador 2");
        persistenciaOfertaLaboral.setFechaPublicacion(fechaCreacion);
        persistenciaOfertaLaboral.setFechaUltimaModificacion(fechaCreacion);
        persistenciaOfertaLaboral.setSueldo(8320.00f);
        persistenciaOfertaLaboral.setDivisa("USD");
        persistenciaOfertaLaboral.setDescripcion("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia");
        persistenciaOfertaLaboral.setDuracionEstimada("50");
        persistenciaOfertaLaboral.setDuracionEstimadaEscala("HORA");
        persistenciaOfertaLaboral.setTurnoTrabajo("DIURNO");
        persistenciaOfertaLaboral.setNumeroVacantes(2);
        persistenciaOfertaLaboral.setEstado('P');
        return persistenciaOfertaLaboral;
         */
        return null;
    }

    public QDtoOfertasLaboralesActivas obtenerQDTOOfertaLaboralPython() {
        /*
        QDtoOfertasLaboralesActivas qDtoOfertasLaboralesActivas = new QDtoOfertasLaboralesActivas();
        qDtoOfertasLaboralesActivas.setUuidEmpresa(empresaUUID);
        qDtoOfertasLaboralesActivas.setUuid(ofertaUUID);
        qDtoOfertasLaboralesActivas.setTitulo("Se busca desarrollador en Python");
        qDtoOfertasLaboralesActivas.setCargo("Desarrollador 2");
        qDtoOfertasLaboralesActivas.setFechaPublicacion(fechaCreacion);
        qDtoOfertasLaboralesActivas.setFechaUltimaModificacion(fechaCreacion);
        qDtoOfertasLaboralesActivas.setSueldo(8320.00f);
        qDtoOfertasLaboralesActivas.setDivisa("USD");
        qDtoOfertasLaboralesActivas.setDescripcion("Se busca desarrollador en Python sin conocimientos de principios SOLID y con 10 años de experiencia");
        qDtoOfertasLaboralesActivas.setDuracionEstimada("50");
        qDtoOfertasLaboralesActivas.setDuracionEstimadaEscala("HORA");
        qDtoOfertasLaboralesActivas.setTurnoTrabajo("DIURNO");
        qDtoOfertasLaboralesActivas.setNumeroVacantes(2);
        qDtoOfertasLaboralesActivas.setEstado('P');
        qDtoOfertasLaboralesActivas.setNombreEmpresa("Cobras y lagartos SoftwareFactory");
        return qDtoOfertasLaboralesActivas;
         */
        return null;
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
        /*
        return new TuplaOfertaLaboral(new NombreEmpresa("Cobras y lagartos SoftwareFactory"),new OfertaLaboral(
                new IdEmpresa(empresaUUID.toString()),
                new IdOfertaLaboral(ofertaUUID.toString()),
                new TituloOfertaLaboral("Se busca desarrollador en Java"),
                new CargoOfertaLaboral("Desarrollador Infra III"),
                new FechaPublicacionOfertaLaboral(fechaCreacion,null),
                new SueldoOfertaLaboral(15020.00f, EnumMoneda.USD),
                new DescripcionOfertaLaboral("Se busca desarrollador en Java sin conocimientos de principios SOLID y con 10 años de experiencia"),
                new DuracionEstimadaOfertaLaboral(50, EnumEscalaTiempo.HORA),
                new TurnoTrabajoOfertaLaboral(EnumTurnoTrabajo.DIURNO),
                new NumeroVacantes(2),
                new EstadoOfertaLaboral(EnumEstadoOfertaLaboral.PUBLICADA)
        ));
         */
        return null;
    }

}
