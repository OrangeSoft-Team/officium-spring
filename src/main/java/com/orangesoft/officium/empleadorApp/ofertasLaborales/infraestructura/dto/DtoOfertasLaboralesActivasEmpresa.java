package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoOfertasLaboralesActivasEmpresa {
    private String uuid;
    private String titulo;
    private String fichaPublicacion;
    private String cargo;
    private Float suelo;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
}
