package com.orangesoft.officium.administadorApp.administrador.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDatosBasicosPersonalAdministrativo {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String genero;
    private String numeroTelefonico;
    private String fechaNacimiento;
}
