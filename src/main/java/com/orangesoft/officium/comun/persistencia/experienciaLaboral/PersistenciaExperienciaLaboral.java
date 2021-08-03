package com.orangesoft.officium.comun.persistencia.experienciaLaboral;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "experienciasLaborales")
public class PersistenciaExperienciaLaboral {
    @Id
    @Generated
    private UUID uuid;
    @NotNull
    private String cargo;
    @NotNull
    private String nombreEmpresa;
    @NotNull
    private Instant fechaInicio;
    @NotNull
    private Instant fechaFin;
    @NotNull
    private UUID uuidEmpleado;
}
