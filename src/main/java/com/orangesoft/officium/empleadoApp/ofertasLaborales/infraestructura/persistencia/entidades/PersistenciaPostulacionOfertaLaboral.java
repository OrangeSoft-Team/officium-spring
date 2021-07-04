package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "postulacionOfertaLaboral")
public class PersistenciaPostulacionOfertaLaboral {
    @EmbeddedId
    IdPersisenciaPostulacionOfertaLaboral idPostulacionOfertaLaboral;
    @NotNull
    private Instant fechaDePostulacion;
    @NotNull
    private char estado;
    private String comentario;
}
