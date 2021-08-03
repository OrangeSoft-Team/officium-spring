package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query;

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
    private Instant fechaLimiteAplicacion;
    private Instant fechaUltimaModificacion;
    private String cargo;
    private float sueldo;
    private String descripcion;
    private String duracionEstimadaEscala;
    private int duracionEstimada;
    private String turnoTrabajo;
    private int numeroVacantes;
    private String estatus;
    private String requisitosEspeciales;
}
