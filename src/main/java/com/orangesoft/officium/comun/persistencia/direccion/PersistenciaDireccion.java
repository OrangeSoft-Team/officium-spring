package com.orangesoft.officium.comun.persistencia.direccion;

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
@Entity(name = "direcciones")
public class PersistenciaDireccion {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String calleUno;
    @NotNull
    private String codigoPostal;
    @NotNull
    private UUID uuidCiudad;
    private String calleDos;
}
