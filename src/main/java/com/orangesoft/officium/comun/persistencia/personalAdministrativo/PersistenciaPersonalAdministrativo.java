package com.orangesoft.officium.comun.persistencia.personalAdministrativo;

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
@Entity(name = "personalesAdministrativos")
public class PersistenciaPersonalAdministrativo {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String primerNombre;
    @NotNull
    private String primerApellido;
    @NotNull
    private String correoElectronico;
    @NotNull
    private String cargo;
    @NotNull
    private String token;
}
