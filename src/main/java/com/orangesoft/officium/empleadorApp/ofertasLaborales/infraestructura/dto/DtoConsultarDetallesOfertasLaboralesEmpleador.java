package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoConsultarDetallesOfertasLaboralesEmpleador {
    private String uuid;
    private String titulo;
    private String fechaPublicacion;
    private String fechaModificacion;
    private String cargo;
    private Float sueldo;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
    private String estado;
    private String requisitosEspeciales;
    private String uuidHabilidad;
    private String nombreHabilidad;
    private String nombreCategoriaHabilidad;
}
