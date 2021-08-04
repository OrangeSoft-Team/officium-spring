package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDetallePostulacionOfertaLaboralAdministrador {
    private UUID uuid;
    private UUID uuidOfertaLaboral;
    private String tituloOferta;
    private String cargoOferta;
    private String estatus;
    private UUID uuidEmpresa;
    private String nombreEmpresa;
    private UUID uuidEmpleado;
    private String nombreEmpleado;
    private String comentario;
}
