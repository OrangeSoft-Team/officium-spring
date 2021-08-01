package com.orangesoft.officium.comun.persistencia.cursoEmpleado;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
public class PersistenciaIdCursoEmpleado implements Serializable {
    private UUID uuidCurso;
    private UUID uuidEmpleado;
}
