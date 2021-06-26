package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDetalleOfertaLaboralActivaEmpresa {
    private String uuid;
    private String titulo;
    private String fechaPublicacion;
    private String fechaModificacion;
    private String cargo;
    private Float sueldo;
    private String descripcion;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
}
