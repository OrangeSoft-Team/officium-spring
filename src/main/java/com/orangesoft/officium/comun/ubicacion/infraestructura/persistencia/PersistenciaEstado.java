package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "estados")
public class PersistenciaEstado {
    @EmbeddedId
    private IdPersistenciaEstado idPersistenciaEstado;
    private String nombre;
}

