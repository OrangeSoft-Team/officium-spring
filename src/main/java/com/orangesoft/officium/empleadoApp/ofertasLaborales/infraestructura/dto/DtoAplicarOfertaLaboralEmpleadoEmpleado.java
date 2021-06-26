package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoAplicarOfertaLaboralEmpleadoEmpleado {
    private String uuidEmpleado;
    private String uuidEmpresa;
    private String comentario;
}
