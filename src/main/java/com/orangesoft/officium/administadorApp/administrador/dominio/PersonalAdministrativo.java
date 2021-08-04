package com.orangesoft.officium.administadorApp.administrador.dominio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@EqualsAndHashCode
//@Builder
@Getter
@Setter
public class PersonalAdministrativo {
    private UUID uuid;
    private String primerNombre;
    private String primerApellido;
    private String numeroTelefonico;
    private String cargo;
}
