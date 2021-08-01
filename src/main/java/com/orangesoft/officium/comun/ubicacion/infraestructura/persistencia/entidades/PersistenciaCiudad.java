package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ciudades")
public class PersistenciaCiudad {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private UUID uuidEstado;
    @NotNull
    private String nombre;
}
