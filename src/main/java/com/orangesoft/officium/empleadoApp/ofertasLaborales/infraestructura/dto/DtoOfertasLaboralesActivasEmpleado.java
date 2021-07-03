package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoOfertasLaboralesActivasEmpleado {
    private String uuid;
    private String titulo;
    private String fechaPublicacion;
    private String cargo;
    private Float sueldo;
    private String divisa;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
    private String empresaNombre;
}
