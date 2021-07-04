package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoConsultarPostulacionesOfertasLaboralesEmpleado {
    private String uuid;
    private String uuidOfertaLabora;
    private String tituloOfertaLaboral;
    private String cargoOferta;
    private String empresaNombre;
    private String comentario;
}
