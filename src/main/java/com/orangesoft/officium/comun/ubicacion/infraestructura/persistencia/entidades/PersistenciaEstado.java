package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "estados")
public class PersistenciaEstado {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private UUID uuidPais;
    @NotNull
    private String nombre;
}

