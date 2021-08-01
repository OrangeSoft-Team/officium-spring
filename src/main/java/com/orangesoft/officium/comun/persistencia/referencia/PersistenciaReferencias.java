package com.orangesoft.officium.comun.persistencia.referencia;

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
@Entity(name = "referencias")
public class PersistenciaReferencias {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String primerNombre;
    @NotNull
    private String primerApellido;
    @NotNull
    private String cargo;
    @NotNull
    private String nombreEmpresa;
    @NotNull
    private String telefono;
    @NotNull
    private String correoElectronico;
    @NotNull
    private UUID uuidEmpleado;
    private String segundoNombre;
    private String segundoApellido;
}
