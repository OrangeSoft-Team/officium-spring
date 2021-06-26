package com.orangesoft.officium.empleadoApp.administrador.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDatosInicioSesionEmpleado {
    private String correoElectronico;
    private String contrasena;
}
