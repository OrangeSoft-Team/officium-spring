package com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.generics.TuplaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.escalaTiempo.dominio.EnumEscalaTiempo;
import com.orangesoft.officium.empleadoApp.estadoOfertaLaboral.dominio.EnumEstadoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.moneda.dominio.EnumMoneda;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.turnoTrabajo.dominio.EnumTurnoTrabajo;

import java.time.Instant;
import java.util.UUID;

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

    public Tupla<NombreEmpresa,OfertaLaboral> obtenerEntidadOfertaLaboralPython() {
        return new TuplaOfertaLaboral(new NombreEmpresa("Cobras y lagartos SoftwareFactory"),new OfertaLaboral(
                new IdOfertaLaboral(empresaUUID.toString(), ofertaUUID.toString()),
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
    }

    public PersistenciaOfertaLaboral obtenerPersistenciaOfertaLaboralPython() {
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
    }

    public QDtoOfertasLaboralesActivas obtenerQDTOOfertaLaboralPython() {
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
        return new TuplaOfertaLaboral(new NombreEmpresa("Cobras y lagartos SoftwareFactory"),new OfertaLaboral(
                new IdOfertaLaboral(empresaUUID.toString(), ofertaUUID.toString()),
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
    }

}
