package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "paises")
public class PersistenciaPais {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotEmpty
    private String nombre;
}
