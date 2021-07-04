package com.orangesoft.officium.empleadoApp.empleado.infraestructura.persistencia.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
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
    @Email
    private String correoElectronico;
    @NotNull
    private String contrasena;
    @NotNull
    private String primerNombre;
    @NotNull
    private String primerApellido;
    @NotNull
    private char genero;
    @NotNull
    private String numeroTelefonico;
    @NotNull
    private Boolean activo;
    @NotNull
    private UUID uuidPais;
    @NotNull
    private UUID uuidEstado;
    @NotNull
    private UUID uuidCiudad;
    @NotNull
    private String segundoNombre;
    @NotNull
    private String segundoApellido;
}
