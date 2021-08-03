package com.orangesoft.officium.comun.persistencia.entrevista;

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
@Entity(name = "entrevistas")
public class PersistenciaEntrevista {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private Instant fechaPautada;
    @NotNull
    private String asunto;
    @NotNull
    private String estatus;
    @NotNull
    private UUID uuidPostulacion;
    @NotNull
    private UUID uuidAdmin;
    private String vinculo;
}
