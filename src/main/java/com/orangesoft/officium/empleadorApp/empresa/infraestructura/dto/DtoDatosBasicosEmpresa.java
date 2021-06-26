package com.orangesoft.officium.empleadorApp.empresa.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDatosBasicosEmpresa {
    private String nombreEmpresa;
    private String correoElectronico;
    private String direccionCalle;
    private String codigopostal;
    private String uuidPais;
    private String uuidEstado;
    private String uuidMunicipio;
}
