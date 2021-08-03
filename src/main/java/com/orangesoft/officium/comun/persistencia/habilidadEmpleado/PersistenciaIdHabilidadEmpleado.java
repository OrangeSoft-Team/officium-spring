package com.orangesoft.officium.comun.persistencia.habilidadEmpleado;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
public class PersistenciaIdHabilidadEmpleado implements Serializable {
    private UUID uuidHabilidad;
    private UUID uuidEmpleado;
}
