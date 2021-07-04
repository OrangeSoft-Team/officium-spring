package com.orangesoft.officium.comun.persistencia.ofertaLaboral;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
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
    private String titulo;
    @NotNull
    private String cargo;
    @NotNull
    private float sueldo;
    @NotNull
    private String divisa;
    @NotNull
    private String descripcion;
    @NotNull
    private String duracionEstimadaEscala;
    @NotNull
    private String duracionEstimada;
    @NotNull
    private String turnoTrabajo;
    @NotNull
    private int numeroVacantes;
    @NotNull
    private char estado;
}
