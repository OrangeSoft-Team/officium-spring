package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DtoCrearOfertaLaboralEmpleador {
    private String titulo;
    private String cargo;
    private Integer sueldo;
    private String descripcion;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
    private String requisitosEspeciales;
    private String uuidHabilidad;
    private String nombreHabilidad;
    private String nombreCategoriaHabilidad;
}
