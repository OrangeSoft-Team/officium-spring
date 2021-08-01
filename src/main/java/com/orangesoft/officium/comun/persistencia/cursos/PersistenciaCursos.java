package com.orangesoft.officium.comun.persistencia.cursos;

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
@Entity(name = "cursos")
public class PersistenciaCursos {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String titulo;
    @NotNull
    private String estatus;
    @NotNull
    private int valorDuracion;
    @NotNull
    private String escalaDuracion;
    @NotNull
    private Instant fechaUltimaModificacion;
}
