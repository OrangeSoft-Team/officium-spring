package com.orangesoft.officium.empleadoApp.administrador.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoRespuestaInicioSesionEmpleado {
    private String tokenSesion;
    private String expira;
    private String tokenActualizacion;
    private String uuidEmpleado;
}
