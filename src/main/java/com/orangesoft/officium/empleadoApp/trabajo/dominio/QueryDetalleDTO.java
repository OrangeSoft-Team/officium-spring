package com.orangesoft.officium.empleadoApp.trabajo.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.Direccion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryDetalleDTO {
    private UUID uuid;
    private String titulo;
    private Instant fechaInicioTrabajo;
    private String cargo;
    private UUID uuidEmpresa;
    private String nombreEmpresa;
    private String direccion;
    private String numerosTelefonicos;
    private String estatus;
    private float sueldo;
    private String descripcion;
    private int valorDuracion;
    private String escalaDuracion;
    private String turnoTrabajo;
    private Instant fechaCulmiacionTrabajo;
}
