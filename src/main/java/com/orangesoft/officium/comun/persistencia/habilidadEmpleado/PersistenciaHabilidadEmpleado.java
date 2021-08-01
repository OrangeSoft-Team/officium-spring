package com.orangesoft.officium.comun.persistencia.habilidadEmpleado;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "habilidadesEmpleados")
public class PersistenciaHabilidadEmpleado {
    @EmbeddedId
    private PersistenciaIdHabilidadEmpleado id;
}
