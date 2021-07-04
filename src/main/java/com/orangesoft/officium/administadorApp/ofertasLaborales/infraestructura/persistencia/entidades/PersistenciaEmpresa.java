package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "empresas")
public class PersistenciaEmpresa {
    @Id
    private UUID uuid;

    @NotNull
    private String nombre;

    @NotNull
    private String correoElectronico;

    @NotNull
    private int codigoPostal;

    @NotNull
    private UUID idCiudad;
}
