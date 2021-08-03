package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto;

import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDetalleOfertaLaboralActivaEmpleado {
    private String uuid;
    private String titulo;
    private String fechaPublicacion;
    private String fechaModificacion;
    private String cargo;
    private String divisa;
    private Float sueldo;
    private String descripcion;
    private Integer duracionEstimadaValor;
    private String duracionEstimadaEscala;
    private String turnoTrabajo;
    private Integer numeroVacantes;
    private String requisitosEspecialesEspecificos;
    private String requisitosEspecialesGenerales;
    private String uuidEmpresa;
    private String empresaNombre;
    private String direccionEmpresa;
    private List<DtoHabilidad> habilidades;
}
