package com.orangesoft.officium.administadorApp.administrador.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoRespuestaInicioSesionPersonalAdministrativo {
    private String tokenSesion;
    private String expira;
    private String tokenActualizacion;
    private String uuidPersonalAdministrativo;
}
