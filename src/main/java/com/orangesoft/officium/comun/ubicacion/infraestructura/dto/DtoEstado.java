package com.orangesoft.officium.comun.ubicacion.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoEstado {
    private String uuidPais;
    private String uuidEstado;
    private String nombreCiudad;
}
