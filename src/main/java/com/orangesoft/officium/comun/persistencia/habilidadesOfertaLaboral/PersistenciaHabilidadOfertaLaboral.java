package com.orangesoft.officium.comun.persistencia.habilidadesOfertaLaboral;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "habilidadesOfertas")
public class PersistenciaHabilidadOfertaLaboral {
    @EmbeddedId
    private PersistenciaIdHabilidadOfertaLaboral id;
}
