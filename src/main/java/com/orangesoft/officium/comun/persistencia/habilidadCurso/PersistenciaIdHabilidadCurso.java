package com.orangesoft.officium.comun.persistencia.habilidadCurso;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
public class PersistenciaIdHabilidadCurso implements Serializable {
    private UUID uuidHabilidad;
    private UUID uuidCurso;
}
