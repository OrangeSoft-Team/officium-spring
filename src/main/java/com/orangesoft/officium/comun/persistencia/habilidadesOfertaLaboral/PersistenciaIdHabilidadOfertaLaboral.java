package com.orangesoft.officium.comun.persistencia.habilidadesOfertaLaboral;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Getter
@Setter
public class PersistenciaIdHabilidadOfertaLaboral implements Serializable {
    private UUID uuidHabilidad;
    private UUID uuidOferta;
}
