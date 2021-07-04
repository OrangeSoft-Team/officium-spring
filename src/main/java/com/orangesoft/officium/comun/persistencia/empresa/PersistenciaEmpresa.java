package com.orangesoft.officium.comun.persistencia.empresa;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "empresas")
public class PersistenciaEmpresa {
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
