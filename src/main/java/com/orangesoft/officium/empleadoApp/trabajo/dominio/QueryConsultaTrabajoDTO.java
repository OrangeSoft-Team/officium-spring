package com.orangesoft.officium.empleadoApp.trabajo.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryConsultaTrabajoDTO {
    private UUID uuid;
    private String titulo;
    private Instant fechaInicioTrabajo;
    private String cargo;
    private String nombreEmpresa;
    private String estatus;
}
