package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades;

import lombok.*;

import javax.persistence.*;

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

