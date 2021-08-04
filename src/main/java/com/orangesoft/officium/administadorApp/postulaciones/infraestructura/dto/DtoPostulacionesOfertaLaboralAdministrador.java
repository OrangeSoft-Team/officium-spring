package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoPostulacionesOfertaLaboralAdministrador {
    private UUID uuid;
    private String tituloOferta;
    private String cargoOferta;
    private String estatus;
    private String nombreEmpresa;
    private String nombreEmpleado;
}
