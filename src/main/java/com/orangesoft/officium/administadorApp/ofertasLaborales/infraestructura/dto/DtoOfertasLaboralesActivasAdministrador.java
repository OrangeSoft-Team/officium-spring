package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoOfertasLaboralesActivasAdministrador {
    private String uuid;
    private String titulo;
    private String fechaPublicacion;
    private String cargo;
    private Float sueldo;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private String numeroVacantes;
    private String empresaNombre;
}
