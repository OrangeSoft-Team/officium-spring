package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDetalleOfertaLaboralActivaAdministrador {
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
    private String uuidEmpresa;
    private String empresaNombre;
    private String direccionEmpresa;
}
