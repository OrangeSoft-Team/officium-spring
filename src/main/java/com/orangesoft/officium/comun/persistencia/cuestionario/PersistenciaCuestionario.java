package com.orangesoft.officium.comun.persistencia.cuestionario;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "cuestionarios")
public class PersistenciaCuestionario {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private int valorDuracion;
    @NotNull
    private String escalaDuracion;
    @NotNull
    private int intentosPermitidos;
    @NotNull
    private UUID uuidCurso;
}

