package com.orangesoft.officium.comun.persistencia.lecciones;

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
@Entity(name = "lecciones")
public class PersistenciaLecciones {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String titulo;
    @NotNull
    private String descripcion;
    @NotNull
    private String contenido;
    @NotNull
    private UUID uuidCurso;
}
