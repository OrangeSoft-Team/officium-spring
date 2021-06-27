package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ciudades")
public class PersistenciaCiudad {
    @EmbeddedId
    private IdPersistenciaCiudad idPersistenciaCiudad;
    private String nombre;
}
