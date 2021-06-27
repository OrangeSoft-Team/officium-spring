package com.orangesoft.officium.comun.ubicacion.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCiudad {
    private String uuidPais;
    private String uuidEstado;
    private String uuidCiudad;
    private String nombreCiudad;
}
