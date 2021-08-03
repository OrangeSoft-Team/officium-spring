package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto;

import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private String requisitosEspeciales;
    private String uuidEmpresa;
    private String empresaNombre;
    private String direccionEmpresa;
    private List<DtoHabilidad> habilidades;
}
