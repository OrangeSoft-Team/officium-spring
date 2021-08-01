package com.orangesoft.officium.comun.persistencia.opcionesPregunta;

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
@Entity(name = "opcionesPreguntas")
public class PersistenciaOpcionesPreguntas {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String valor;
    @NotNull
    private String correcto;
    @NotNull
    private UUID uuidPregunta;
}
