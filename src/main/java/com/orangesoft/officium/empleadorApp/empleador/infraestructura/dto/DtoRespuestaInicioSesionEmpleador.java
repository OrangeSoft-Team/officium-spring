package com.orangesoft.officium.empleadorApp.empleador.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoRespuestaInicioSesionEmpleador {
    private String tokenSesion;
    private String expira;
    private String tokenActualizacion;
    private String uuidEmpresa;
    private String uuidDelegado;
}
