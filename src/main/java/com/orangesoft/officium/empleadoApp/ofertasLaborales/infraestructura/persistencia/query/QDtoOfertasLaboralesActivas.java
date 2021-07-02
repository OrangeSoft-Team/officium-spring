package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query;

import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.IdPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.UUID;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class QDtoOfertasLaboralesActivas {
    private String nombreEmpresa;
    private UUID uuidEmpresa;
    private UUID uuid;
    private String titulo;
    private Instant fechaPublicacion;
    private Instant fechaUltimaModificacion;
    private String cargo;
    private float sueldo;
    private String descripcion;
    private String duracionEstimadaEscala;
    private String duracionEstimada;
    private String turnoTrabajo;
    private int numeroVacantes;
    private char estado;
}
