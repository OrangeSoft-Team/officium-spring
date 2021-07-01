package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ofertasLaborales")
public class PersistenciaOfertaLaboral {
    @EmbeddedId
    private IdPersistenciaOfertaLaboral idPersistenciaOfertaLaboral;
    @NotNull
    private Instant fechaPublicacion;
    @NotNull
    private Instant fechaUltimaModificacion;
    @NotNull
    private String cargo;
    @NotNull
    private String sueldo;
    @NotNull
    private String descripcion;
    @NotNull
    private String duracionEstimadaEscala;
    @NotNull
    private String duracionEstimada;
    @NotNull
    private String turnoTrabajo;
    @NotNull
    private String numeroVacantes;
    @NotNull
    private char estado;
}
