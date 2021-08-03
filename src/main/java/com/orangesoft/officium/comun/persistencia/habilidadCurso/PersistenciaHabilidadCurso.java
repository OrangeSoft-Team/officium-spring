package com.orangesoft.officium.comun.persistencia.habilidadCurso;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "habilidadesCursos")
public class PersistenciaHabilidadCurso {
    @EmbeddedId
    private PersistenciaIdHabilidadCurso persistenciaIdHabilidadCurso;
}
