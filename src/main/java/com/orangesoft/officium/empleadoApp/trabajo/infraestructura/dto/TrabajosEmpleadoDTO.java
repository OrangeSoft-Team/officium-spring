package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrabajosEmpleadoDTO {
    private String uuid;
    private String titulo;
    private String fechaInicioTrabajo;
    private String cargo;
    private String nombreEmpresa;
    private String estatus;
}
