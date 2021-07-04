package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.DuracionEstimadaEscala;
import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ofertasLaborales")
public class PersistenciaOfertaLaboral {
    @EmbeddedId
    public IdPersistenciaOfertaLaboral idPersistenciaOfertaLaboral;
    @NotNull
    public Instant fechaPublicacion;
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
    private String duracionEstimadaValor;
    @NotNull
    private String turnoTrabajo;
    @NotNull
    private int numeroVacantes;
    @NotNull
    private char estado;
}
