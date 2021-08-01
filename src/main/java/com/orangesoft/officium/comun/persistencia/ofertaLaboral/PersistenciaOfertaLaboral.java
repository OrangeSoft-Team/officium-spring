package com.orangesoft.officium.comun.persistencia.ofertaLaboral;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ofertasLaborales")
public class PersistenciaOfertaLaboral {
    @Id
    @Generated
    private UUID uuid;
    @NotNull
    private String titulo;
    @NotNull
    private Instant fechaPublicacion;
    @NotNull
    private Instant fechaLimite;
    @NotNull
    private String cargo;
    @NotNull
    private float sueldo;
    @NotNull
    private String descripcion;
    @NotNull
    private int valorDuracion;
    @NotNull
    private String escalaDuracion;
    @NotNull
    private String turnoTrabajo;
    @NotNull
    private int numeroVacantes;
    @NotNull
    private String estatus;
    @NotNull
    private UUID uuidEmpresa;
    private Instant fechaUltimaModificacion;
    private String requisitosEspeciales;
}
