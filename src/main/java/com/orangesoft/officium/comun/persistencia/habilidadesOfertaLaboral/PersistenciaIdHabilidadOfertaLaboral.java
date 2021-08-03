package com.orangesoft.officium.comun.persistencia.habilidadesOfertaLaboral;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
@Getter
@Setter
public class PersistenciaIdHabilidadOfertaLaboral implements Serializable {
    private UUID uuidHabilidad;
    private UUID uuidOferta;
}
