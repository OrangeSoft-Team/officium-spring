package com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers;

import com.orangesoft.officium.comun.dominio.trabajo.EnumEstadoTrabajo;
import com.orangesoft.officium.comun.persistencia.trabajo.PersistenciaTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryConsultaTrabajoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.TrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.DuracionTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.EstadoTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

public class TrabajosMother {

    private final UUID uuidTrabajo = UUID.randomUUID() ;
    private final UUID uuidPostulacion = UUID.randomUUID();
    private final Instant fechaActual = Instant.now();

    public TrabajosEmpleadoDTO obtenerDetalleTrabajoDTO() {
        return new TrabajosEmpleadoDTO(
            uuidTrabajo.toString(),
            "Diseñador grafico",
            fechaActual.toString(),
            "Diseñador 2",
            "Corel Draw Sol",
            "EN PROGRESO"
        );
    }

    public QueryConsultaTrabajoDTO trabajosEmpleadosQuery() {
        return new QueryConsultaTrabajoDTO(
           uuidTrabajo,
           "Diseñador grafico",
           fechaActual,
           "Diseñador 2",
           "Corel Draw Sol",
           "EN PROGRESO"
        );
    }
}
