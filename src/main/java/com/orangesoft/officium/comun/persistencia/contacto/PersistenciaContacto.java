package com.orangesoft.officium.comun.persistencia.contacto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "contactos")
public class PersistenciaContacto {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotEmpty
    private String primerNombre;
    @NotEmpty
    private String primerApellido;
    @NotEmpty
    private String correoElectronico;
    @NotEmpty
    private String telefono;
    @NotEmpty
    private String genero;
    @NotEmpty
    private String cargo;
    @NotEmpty
    private UUID uuidEmpresa;
    private String segundoNombre;
    private String segundoApellido;
}
