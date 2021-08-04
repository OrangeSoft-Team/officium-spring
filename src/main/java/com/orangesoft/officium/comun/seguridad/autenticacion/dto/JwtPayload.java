package com.orangesoft.officium.comun.seguridad.autenticacion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtPayload {
    private String idUsuario;
    private Integer iat;
}
