package com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoHabilidad {
    private String uuid;
    private String nombre;
    private String categoria;
}
