package com.orangesoft.officium.comun.persistencia.trabajo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "trabajos")
public class PersistenciaTrabajo {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private Instant fechaInicio;
    @NotNull
    private String estatus;
    @NotNull
    private UUID uuidPostulacion;
    private Instant fechaCulminacion;
}
