package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleTrabajoEmpleadoDTO {
    private String uuid;
    private String titulo;
    private String fechaInicioTrabajo;
    private String cargo;
    private String uuidEmpresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private ArrayList<String> numerosTelefonicos;
    private String estatus;
    private String sueldo;
    private String descripcion;
    private String valorDuracion;
    private String escalaDuracion;
    private String turnoTrabajo;
    private String fechaCulmiacionTrabajo;
}
