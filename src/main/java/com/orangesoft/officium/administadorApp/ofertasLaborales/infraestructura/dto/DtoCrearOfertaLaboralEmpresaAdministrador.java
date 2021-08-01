package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto;

import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
// TODO MODIFICAR MAPPER
public class DtoCrearOfertaLaboralEmpresaAdministrador {
    private String uuidEmpresa;
    private String titulo;
    private String cargo;
    private Float sueldo;
    private String descripcion;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
    private String requisitosEspeciales;
    private List<DtoHabilidad> habilidades;
}
