package com.orangesoft.officium.comun.persistencia.habilidad;

import lombok.*;

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
@Entity(name = "habilidades")
public class PersistenciaHabilidad {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String nombre;
    @NotNull
    private String categoria;
}

