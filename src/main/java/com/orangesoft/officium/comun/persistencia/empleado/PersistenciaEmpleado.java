package com.orangesoft.officium.comun.persistencia.empleado;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "empleados")
public class PersistenciaEmpleado {
    @Id
    @Generated
    private UUID uuid;
    @NotNull
    private String primerNombre;
    @NotNull
    private String primerApellido;
    @NotNull
    @Email
    private String correoElectronico;
    @NotNull
    private String telefono;
    @NotNull
    private String nivelEducativo;
    @NotNull
    private String estatus;
    @NotNull
    private String genero;
    @NotNull
    private Instant fechaNacimiento;
    @NotNull
    private String token;
    @NotNull
    private UUID uuidDireccion;
    private String segundoNombre;
    private String segundoApellido;
}
