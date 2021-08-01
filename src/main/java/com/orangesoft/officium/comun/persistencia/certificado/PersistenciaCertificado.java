package com.orangesoft.officium.comun.persistencia.certificado;

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
@Entity(name = "certificados")
public class PersistenciaCertificado {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private Instant fechaExpedicion;
    @NotNull
    private String descripcion;
    @NotNull
    private UUID uuidCurso;
    @NotNull
    private UUID uuidEmpleado;
}
