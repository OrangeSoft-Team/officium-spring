package com.orangesoft.officium.empleadorApp.empleador.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDatosInicioSesionEmpleador {
    private String correoElectronico;
    private String contrasena;
}
