package com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades;

import lombok.*;

import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empresas")
public class EmpresaPersistencia {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotEmpty
    private String nombre;
    @Email
    @NotEmpty
    private String correoElectronico;
    @NotEmpty
    private String direccionCalle;
    @NotEmpty
    private String codigoPostal;
    @NotEmpty
    private UUID uuidPais;
    @NotEmpty
    private UUID uuidEstado;
    @NotEmpty
    private UUID uuidCiudad ;
}
