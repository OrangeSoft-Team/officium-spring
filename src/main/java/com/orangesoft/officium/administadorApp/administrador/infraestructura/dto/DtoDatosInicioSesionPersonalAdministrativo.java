package com.orangesoft.officium.administadorApp.administrador.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDatosInicioSesionPersonalAdministrativo {
    private String correoElectronico;
    private String contrasena;
}
