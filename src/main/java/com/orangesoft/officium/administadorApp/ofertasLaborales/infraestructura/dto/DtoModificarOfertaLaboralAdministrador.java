package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto;

import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoModificarOfertaLaboralAdministrador {
    private String titulo;
    private String cargo;
    private Float sueldo;
    private String descripcion;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
    private String requisitosEspeciales;
    private List<UUID> habilidades;
}
