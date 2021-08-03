package com.orangesoft.officium.comun.persistencia.postulacionOfertaLaboral;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.EmbeddedId;
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
@Entity(name = "postulacionesOfertasLaborales")
public class PersistenciaPostulacionOfertaLaboral {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private Instant fechaPostulacion;
    @NotNull
    private String estatus;
    @NotNull
    private UUID uuidOferta;
    @NotNull
    private UUID uuidEmpleado;
    private String comentario;
}
