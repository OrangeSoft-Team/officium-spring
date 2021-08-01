package com.orangesoft.officium.comun.persistencia.cursoEmpleado;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "cursosEmpleados")
public class PersistenciaCursoEmpleado {
    @EmbeddedId
    private PersistenciaIdCursoEmpleado id;
}
